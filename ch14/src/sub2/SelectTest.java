package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/* 날짜 : 2024.07.29
 * 이름 : 정지현
 * 내용 : Select 실습하기 
 */
public class SelectTest {

	public static void main(String[] args) {
		String host = "jdbc:mysql://127.0.0.1:3306/studydb"; // <-- 마지막 접속 데이터베이스명
		String user = "root";
		String pass = "1234";
		
		//결과처리 리스트 생성
		List<Tb1userVo> user1s = new ArrayList<>();
		
		
		try {
			//1단계 : 데이터베이스 접속
			Connection conn = DriverManager.getConnection(host,user,pass);
			//2단계 : SQL실행 객체 생성
			Statement stmt = conn.createStatement();
			//3단계 : SQL 실행
			String sql = "select * from `tb1user`";
			
			ResultSet rs = stmt.executeQuery(sql); // <-- Select문은 executeQuery()으로 실행
			
			//4단계 : ResultSet 결과처리
			while(rs.next()) /*제목에 위치하던 커서가 데이터가 있는 아래를 가리킴(첫번째 행) 해당 쿼리문은 행이 5개(제목포함)이므로 4번 반복함*/ {
				
				
				// 조회된 데이터 갯수(튜플) 만큼 Cursor를 한 행씩 내려가면서 데이터 조회
				String uid 	= rs.getString(1);
				String name = rs.getString(2);
				String hp 	= rs.getString(3);
				String age 	= rs.getString(4);
				String adr 	= rs.getString(5);
				
				
				// 리스트 생성 (100%) 생성된 하나하나의 객체를 VO(Value Object) 객체라고 함
				
				Tb1userVo vo = new Tb1userVo();
				vo.setUid(uid);
				vo.setName(name);
				vo.setHp(hp);
				vo.setAge(age);
				vo.setAdr(adr);
				
				user1s.add(vo);
				
				/*정수형일때는 int age = rs.getint(4)*/
			
			}
			//5단계 : 접속종료
			stmt.close();
			conn.close();
			rs.close();
			
		}catch (Exception e){
			e.printStackTrace();
		}
		
		//리스트 출력
		for(Tb1userVo vo:user1s) {
			System.out.println(vo);
		}
		System.out.println("select 완료");

	}

}
