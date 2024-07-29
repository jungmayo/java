package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/* 날짜 : 2024.07.29
 * 이름 : 정지현
 * 내용 : Delete 실습하기 
 */
public class DeleteTest {

	public static void main(String[] args) {
		String host = "jdbc:mysql://127.0.0.1:3306/studydb"; // <-- 마지막 접속 데이터베이스명
		String user = "root";
		String pass = "1234";
		
		try {
			//데이터베이스 접속
		Connection conn = DriverManager.getConnection(host,user,pass);
		
			//객체 생성
		Statement stmt = conn.createStatement();
		

		/*String sql = "Delete From `tb1user` ";
			   sql += "where `uid`='j101'";
			   stmt.executeUpdate(sql); */
			   
		stmt.executeUpdate("Delete From `tb1user` where `uid`='j102'");
			   
				stmt.close();
				conn.close();
				
			}catch(Exception e) {
				e.printStackTrace();
				
			}

	}

}
