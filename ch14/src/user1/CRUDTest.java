package user1;

import java.util.List;
import java.util.Scanner;

/* 날짜 : 2024.07.30
* 이름 : 정지현
* 내용 : Transaction(트랜잭션) 실습하기 
*/	

public class CRUDTest {
	
	public static void main(String[] args) {
		
		System.out.println("---------------------");
		System.out.println("회원 관리 매니저 v1.0");
		System.out.println("---------------------");
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("종료:0, 입력:1, 조회:2, 검색:3, 수정:4, 삭제:5");
			System.out.print("선택> ");
			
			int answer = sc.nextInt();
			sc.nextLine();
			if(answer==0) {
				break;
			}else if(answer==1) {
				
				System.out.print("아이디 입력 : ");
				String uid = sc.nextLine();
				System.out.print("이름 입력 : ");
				String name = sc.nextLine();
				System.out.print("핸드폰 번호 입력 : ");
				String hp = sc.nextLine();
				System.out.print("나이 입력 : ");
				String age = sc.nextLine();
				System.out.print("주소 입력 : ");
				String adr = sc.nextLine();
				
				User1VO vo = new User1VO(uid,name,hp,age,adr);
				UserDAO dao = UserDAO.getInstance();
				dao.insertUser(vo);
				
				System.out.println("입력완료");
				
				
				
			}else if(answer==2) {
				
				UserDAO dao = UserDAO.getInstance();
				List<User1VO> users = dao.selectUsers();
				
				for (User1VO user : users) {
					System.out.println(user);
				}
				
			}else if(answer==3) {
				
				System.out.println("검색 아이디 : ");
				String searchUid = sc.nextLine();
				
				UserDAO dao = UserDAO.getInstance();
				User1VO user = dao.selectUser(searchUid);
				
				System.out.println(user);
				
				
				
			}else if(answer==4) {
				User1VO user = new User1VO();
				
				System.out.print("수정 회원 아이디 입력 : ");
				user.setUid(sc.next());
				
				System.out.print("수정 회원 이름 입력 : ");
				user.setName(sc.next());
				
				System.out.print("수정 회원 핸드폰 입력 : ");
				user.setHp(sc.next());
				
				System.out.print("수정 회원 나이 입력 : ");
				user.setAge(sc.next());
				
				System.out.print("수정 회원 주소 입력 : ");
				user.setAdr(sc.next());
				
				int result = UserDAO.getInstance().updatetUser(user);
				
				if(result>0) {
					System.out.println("수정완료");
				}else {
					System.out.println("수정할 회원 아이디가 없습니다.");
				}
				
			}else if(answer==5) {
				
				System.out.println("삭제 회원 아이디 입력 : ");
				String uid = sc.nextLine();
				int result = UserDAO.getInstance().deleteUser(uid);
				
				if(result >0 ) {
					System.out.println("삭제완료");
				}else {
					System.out.println("삭제할 회원 아이디가 없습니다.");
				}
				
				
				
			
				
			}
			
			/*switch(answer) {
			case 0:
				break;
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;*/
				
		} // end switch
	} //end while
		
		
}


