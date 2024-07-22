package sec1;
/*
 * 603 p
 * 
 */
public class ThreadNameExample {

	public static void main(String[] args) {
		Thread mainThread = Thread.currentThread(); //현재코드를 어떤 스레드가 실행하고 있는지 확인하기 위해서 해당코드를 실행하는 스레드 객체 참조 얻기
		System.out.println(mainThread.getName() + "실행");
		
		for(int i = 0; i<3; i++) {
			Thread threadA = new Thread() {
				public void run() {
					System.out.println(getName()+ "실행"); //thread-n으로 리턴
				}
			};
			threadA.start();
		}
		Thread chatThread = new Thread() {
			public void run() {
				System.out.println(getName()+ "실행");
			}
		};
		chatThread.setName("chat-Thread"); //작업 스레드 이름변경
		chatThread.start();
	}

}
