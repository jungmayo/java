package sub3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/* 날짜 : 2024.07.29
 * 이름 : 정지현
 * 내용 : PreparedStatement 실습하기 
 */
public class PreparedSelectTest {

	public static void main(String[] args) {
		
		//DB정보
		List<User2Vo> user2s = new ArrayList<User2Vo>();
		String host = "jdbc:mysql://127.0.0.1:3306/studydb"; // <-- 마지막 접속 데이터베이스명
		String user = "root";
		String pass = "1234";
		
		try {
			//1단계 : 데이터베이스 접속
			Connection con = DriverManager.getConnection(host,user,pass);
			//2단계 : SQL실행 객체(PreparedStatement) 생성
			String sql = "select * from `user2`";
			PreparedStatement psmt = con.prepareStatement(sql);
			
			//3단계 : SQL실행
			ResultSet rs = psmt.executeQuery();
			
			//4단계 : ResultSet 결과처리
			
			while(rs.next()) {
				User2Vo vo = new User2Vo();
				vo.setUid(rs.getString(1));
				vo.setName(rs.getNString(2));
				vo.setBirth(rs.getString(3));
				vo.setAdrr(rs.getString(4));
				
				user2s.add(vo);
			
			}
			
			
			//5단계 : 데이터베이스 종료
			rs.close();
			psmt.close();
			con.close();
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		for(User2Vo vo : user2s) {
			System.out.println(vo);
		}

	}

}
