package user2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class User2DAO {

	
	//싱글톤
	private static User2DAO instance = new User2DAO();
	public static User2DAO getInstance() {
		return instance;
	}
	private User2DAO() {}

	//DB정보
	private final static String HOST = "jdbc:mysql://localhost:3306/studydb";
	private final static String USER = "root";
	private final static String PASS = "1234";
	
	//CURD 메서드
	//1. 입력
	public void insertUser(User2VO vo) {
		
		String sql = "INSERT INTO `user2` values (?,?,?,?)";
		try {
			Connection conn = DriverManager.getConnection(HOST,USER,PASS);
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setString(1, vo.getUid());
			stmt.setString(2, vo.getName());
			stmt.setString(3, vo.getBirth());
			stmt.setString(4, vo.getAdrr());
			
			stmt.executeUpdate();
			stmt.close();
			conn.close();
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	//2. 전체조회
	public List<User2VO> selectUsers() {
		
		
		List<User2VO> users = new ArrayList<>();
		
		try {
			Connection conn = DriverManager.getConnection(HOST,USER,PASS);
			String sql = "select * from `user2`";
			Statement stmt = conn.createStatement();
			
			ResultSet rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				String uid = rs.getString(1);
				String name = rs.getString(2);
				String birth = rs.getString(3);
				String adrr = rs.getString(4);
				
				User2VO vo = new User2VO();
				vo.setUid(uid);
				vo.setName(name);
				vo.setBirth(birth);
				vo.setAdrr(adrr);
				
				users.add(vo);
				
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return users;
	}
	
	//3. 검색
	public User2VO selectUser(String uid) {
		
		String sql = "select * from `user2` where `uid` = ?";
		
		
		User2VO user = new User2VO();
		
		try {
			Connection conn = DriverManager.getConnection(HOST,USER,PASS);
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setString(1, uid);
			
			ResultSet rs = stmt.executeQuery();
			
			if(rs.next()) {
				user.setUid(rs.getString(1));
				user.setName(rs.getString(2));
				user.setBirth(rs.getString(3));
				user.setAdrr(rs.getString(4));
			}
			rs.close();
			stmt.close();
			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return user;
	}
	
	//4. 수정
	public int updateUser(User2VO vo) {
		
		String sql = "UPDATE `user2` set `name`=?, `birth`=?, `adrr`=? where `uid`=?"; 
		int result = 0;
		try {
		Connection conn	= DriverManager.getConnection(HOST,USER,PASS);
		PreparedStatement stmt = conn.prepareStatement(sql);
		stmt.setString(1, vo.getName());
		stmt.setString(2, vo.getBirth());
		stmt.setString(3, vo.getAdrr());
		stmt.setString(4, vo.getUid());
		
		result = stmt.executeUpdate();
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	
	//5. 삭제
	public int deletetUser(String uid) {
		
		String sql = "DELETE From `user2` where `uid`=?";
		int result = 0;
		try {
		Connection conn	= DriverManager.getConnection(HOST,USER,PASS);
		PreparedStatement stmt = conn.prepareStatement(sql);
		stmt.setString(1, uid);
		
		result = stmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result; 
	}

















}
