package user3;

import java.util.Scanner;

import user1.UserDAO;

public class User3Main {

	public static void main(String[] args) {
		
		System.out.println("---------------------");
		System.out.println("회원 관리 매니저 v1.3");
		System.out.println("---------------------");
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("종료:0, 입력:1, 조회:2, 검색:3, 수정:4, 삭제:5");
			System.out.print("선택> ");
			int answer = sc.nextInt();
			sc.nextLine();
			if(answer == 0) {
				break;
				//1입력
			}else if(answer == 1) {
				System.out.println("아이디 입력 : ");
				String uid = sc.next();
				System.out.println("이름 입력 : ");
				String name = sc.next();
				System.out.println("생일 입력 : ");
				String birth = sc.next();
				System.out.println("핸드폰 번호 입력 : ");
				String hp = sc.next();
				System.out.println("주소 입력 : ");
				String addr = sc.next();
				
				User3VO vo = new User3VO(uid,name,birth,hp,addr);
				User3DAO dao = User3DAO.getInstance();
				
				//2조회
			}else if(answer == 2) {
				
				
				//3검색
			}else if(answer == 3) {
				
				
				//4 수정
			}else if(answer == 4) {
				
				
				//삭제
			}else if(answer == 5) {
				
			}
		}

	}
}