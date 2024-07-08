package sub2;

/* 날짜 : 2024.07.08
 * 이름 : 정지현
 * 내용: 캡슐화 실습하기
 */
public class EncapsTest {

	public static void main(String[] args) {
		
		//car 객체 생성과 초기화
		Car sonata = new Car("소나타","흰색",0); //괄호안에 생성자를 넣어서 초기화
		
		//초기화 (Car 인스턴스의 속성들을 직접 참조해서 초기화하는 것 : 별로 안좋음)
		//sonata.name = "소나타";
		//sonata.color = "흰색";
		//sonata.speed = 0;
		
		sonata.speedUp(80);
		sonata.speedDown(20);
		sonata.show();
		sonata.setColor("은색");
		
		Car avante = new Car("아반떼","검정",0);
		
		avante.speedUp(100);
		avante.speedDown(40);
		avante.show();
		
		// Account 객체 생성과 초기화
		
		Account kb = new Account("국민은행","101-21-1001","김유신",10000);
		
		//객체 활용
		kb.deposit(40000);//입금
		kb.withdraw(30000);//출금
		kb.setName("김유진");
		kb.show();
		
		Account wr = new Account("우리은행","101-22-1001","김춘추",10000);
		wr.deposit(40000);//입금
		wr.withdraw(30000);//출금
		wr.setBank("유리은행");
		wr.show();
		
		// 클래스 연습문제
		Book java = new Book("이것이 자바다","신용권","121-11-1001",3);
		Book sql = new Book("혼자 공부하는 SQL","우재남","112-10-1102",2);
		
		
		//boolean result = java.borrowBook();
		if(java.borrowBook()) { // book 클래스의 메서드가 boolean값 return값인 ture , false를 넣기위해 if를 사용 그 이후에 sysout으로 출력값 나타냄
			System.out.println("대출 성공");
		}else {
			System.out.println("대출 실패");
		}
		
		System.out.println("남은 도서 수 : " + java.getAvailableCopies());
		java.returnBook(3);
		java.show();
	}

}
