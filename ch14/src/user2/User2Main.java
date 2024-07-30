package user2;

import java.util.List;
import java.util.Scanner;

import user1.UserDAO;

public class User2Main {

	public static void main(String[] args) {
		
		
		System.out.println("---------------------");
		System.out.println("회원 관리 매니저 v1.2");
		System.out.println("---------------------");
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("종료:0, 입력:1, 조회:2, 검색:3, 수정:4, 삭제:5");
			System.out.print("선택> ");
			
			int answer = sc.nextInt();
			sc.nextLine();
			if(answer == 0) {
				break;
				//입력
			}else if (answer == 1) {
				
				System.out.print("아이디 입력 : ");
				String uid = sc.next();
				System.out.print("이름 입력 : ");
				String name = sc.next();
				System.out.print("생일 입력 : ");
				String birth = sc.next();
				System.out.print("주소 입력 : ");
				String adr = sc.next();
				
				User2VO vo = new User2VO(uid,name,birth,adr);
				User2DAO dao = User2DAO.getInstance();
				dao.insertUser(vo); //입력받은 vo를 insertUser메서드에 적용
				
				System.out.println("입력완료");
				
				//조회
			}else if (answer == 2) {
				
				User2DAO dao = User2DAO.getInstance();
				List<User2VO> users = dao.selectUsers();
				
				for(User2VO user : users) {
					System.out.println(user);
				}
				
				//검색
			}else if (answer == 3) {
				
				System.out.println("검색 아이디 : ");
				String search = sc.nextLine();
				
				User2DAO dao = User2DAO.getInstance();
				User2VO user =  dao.selectUser(search);
				
				System.out.println(user);
				
				
				//수정
			}else if (answer == 4) {
				
				User2VO vo = new User2VO();
				System.out.println("수정 회원 아이디 : ");
				vo.setUid(sc.next());
				System.out.println("수정할 이름 : ");
				vo.setName(sc.next());
				System.out.println("수정할 생일 : ");
				vo.setBirth(sc.next());
				System.out.println("수정할 주소 : ");
				vo.setAdrr(sc.next());
				
				int result = User2DAO.getInstance().updateUser(vo);
				
				if(result > 0) {
					System.out.println("수정완료");
				}else {
					System.out.println("수정할 아이디 없음");
				}
				
				//삭제
			}else if (answer == 5) {
				
				System.out.println("삭제할 아이디 : ");
				String uid = sc.next();
				
				int result = User2DAO.getInstance().deletetUser(uid);
				
				if(result > 0) {
					System.out.println("삭제완료");
				}else {
					System.out.println("삭제할 회원 아이디가 없음");
				}
			}
		}
	}

}
