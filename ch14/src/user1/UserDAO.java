package user1;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDAO {
	
	// 싱글톤
	private static UserDAO instance = new UserDAO();
	public static UserDAO getInstance() {
		return instance;
	}
	private UserDAO() {}
	
	
	//DB정보
	private final static String HOST = "jdbc:mysql://localhost:3306/studydb";
	private final static String USER = "root";
	private final static String PASS = "1234";
	
	// CRUD 메서드
	
	
	public void insertUser(User1VO vo)  {
		
		String sql = "INSERT INTO `tb1user` values (?,?,?,?,?)";
		
		try {
			Connection conn = DriverManager.getConnection(HOST,USER,PASS);
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setString(1, vo.getUid());
			psmt.setString(2, vo.getName());
			psmt.setString(3, vo.getHp());
			psmt.setString(4, vo.getAge());
			psmt.setString(5, vo.getAdr());
			
			psmt.executeUpdate();
			psmt.close();
			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public User1VO selectUser(String uid)  {
		
		String sql = "select * from `tb1user` where `uid` = ?";
		User1VO user = null;
		
		try {
			Connection conn = DriverManager.getConnection(HOST,USER,PASS);
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setString(1, uid);
			
			ResultSet rs = psmt.executeQuery();
			
			// 조회결과가 1 또는 0이기 때문에 while 대신 if문으로 next()
			if(rs.next()) {
				user = new User1VO();
				user.setUid(rs.getString(1));
				user.setName(rs.getString(2));
				user.setHp(rs.getString(3));
				user.setAge(rs.getString(4));
				user.setAdr(rs.getString(5));
			}
			rs.close();
			psmt.close();
			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return user;
		
	}
	
	
	
	public List<User1VO> selectUsers() {
		
		String sql = "Select * from `tb1user`";
		List<User1VO> users = new ArrayList<>();
		
		try {
			Connection conn = DriverManager.getConnection(HOST,USER,PASS);
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				User1VO vo = new User1VO();
				vo.setUid(rs.getString(1));
				vo.setName(rs.getString(2));
				vo.setHp(rs.getString(3));
				vo.setAge(rs.getString(4));
				vo.setAdr(rs.getString(5));
				
				users.add(vo);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return users;
	} 
	
	
	
	public int updatetUser(User1VO vo) {
		
		String sql = "UPDATE `tb1user` set `name`=?, `hp`=?, `age`=?, `adr`=? WHERE `uid`=?";
		int result = 0;
		
		try {
			Connection conn = DriverManager.getConnection(HOST,USER,PASS);
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setString(1, vo.getName());
			psmt.setString(2, vo.getHp());
			psmt.setString(3, vo.getAge());
			psmt.setString(4, vo.getAdr());
			psmt.setString(5, vo.getUid());
			
			// sql이 적용되는 row 카운터 반환
			result = psmt.executeUpdate(); //쿼리문이 적용되는 갯수가 리턴됨 
			
			psmt.close();
			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
		
	}
	
	
	public int deleteUser(String uid)  {
		
		String sql = "DELETE from `tb1user` where `uid` = ?";
		int result = 0;
		
		try {
			Connection conn = DriverManager.getConnection(HOST,USER,PASS);
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setString(1, uid);
			
			result = stmt.executeUpdate();
			
			conn.close();
			stmt.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
		
	}







}
