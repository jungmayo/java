package sub2;
/*
 * 날짜 : 2024.07.22
 * 이름 : 정지현
 * 내용 : 스레드 상태 실습하기
 * 
 */

class WorkThread extends Thread{
	@Override
	public void run() { // 작업 스레드로 처리할 메서드
		
		for(int i = 0; i<10; i++) {
			System.out.println("Work Thread 실행");
			
			try {
				Thread.sleep(1000);  // 1000 = 1초 // 스레드 1초 대기
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("Work Thread 종료");
	}
}

public class ThreadJoinTest {

	public static void main(String[] args) {
		
		WorkThread Work = new WorkThread();
		
		Work.start();
		try {
			Work.join(); // 호출한(메인) 메서드는 일시정지 / 작업 스레드 대기 // sub스레드가 종료되면 메인스레드로 합류한다는 의미에서 join
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Main Thread 종료"); //프로그램 종료
		

	}
}


