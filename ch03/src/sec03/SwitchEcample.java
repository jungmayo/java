package sec03;

//121 페이지 
public class SwitchEcample {

	public static void main(String[] args) {
		int num = (int)(Math.random()*6) + 1;
		
		switch(num) {
		case 1:
			System.out.println("1번이 나왔습니다.");
			break;
		case 2:
			System.out.println("2번이 나왔습니다.");
			break;
		case 3:
			System.out.println("3번이 나왔습니다.");
			break;
		case 4:
			System.out.println("4번이 나왔습니다.");
			break;
		case 5:
			System.out.println("5번이 나왔습니다.");
			break;
		default:
			System.out.println("6번이 나왔습니다.");
		}

// 122페이지 
		int time = (int)(Math.random()*4) + 8;
		System.out.println("[현재시간 :" + time + "시]");
		
		switch(time) {
		case 8:
			System.out.println("출근합니다.");
			break;
		case 9:
			System.out.println("회의를 합니다");
			break;
		case 10:
			System.out.println("업무를 봅니다");
			break;
		case 11:
			System.out.println("외근을 나갑니다");
			break;
		default:
			System.out.println("퇴근합니다");	
		}
		
	}

}
