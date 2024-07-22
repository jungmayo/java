package sub1;
/*
 * 날짜 : 2024.07.22
 * 이름 : 정지현
 * 내용 : 스레드 실습하기
 * 
 */
public class ThreadTest {

	public static void main(String[] args) {
		
		SubThread sub1 = new SubThread("sub1");
		SubThread sub2 = new SubThread("sub2");
		
		
		//작업 스레드 시작
		sub1.start(); //run이 아닌 start로 실행 //병행적으로 실행, 순서대로가 아니로 동시에 같이 실행됨
		sub2.start();
		
		for(int i=0; i<10; i++) {
			System.out.println("Main Thread 실행");
			
			try {
				Thread.sleep(1000);  // 1000 = 1초 // 스레드 1초 대기
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("Main Thread 종료");
	}

}
