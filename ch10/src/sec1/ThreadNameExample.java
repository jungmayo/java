package sec1;
/*
 * 603 p
 * 
 */
public class ThreadNameExample {

	public static void main(String[] args) {
		Thread mainThread = Thread.currentThread();
		System.out.println(mainThread.getName() + "실행");
		
		for(int i = 0; i<3; i++) {
			Thread threadA = new Thread() {
				public void run() {
					System.out.println(getName()+ "실행");
				}
			};
			threadA.start();
		}

	}

}
