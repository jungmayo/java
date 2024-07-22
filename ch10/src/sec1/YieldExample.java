package sec1;

class WorkThread extends Thread{
	//필드
	public boolean work = true;
	//생성자
	public WorkThread(String name) {
		setName(name);
	}
	@Override
	public void run() {
		while(true) {
			if(work) {
				System.out.println(getName() + "작업처리");
			}else {
				Thread.yield();
			}
		}
	}
}
public class YieldExample {

	public static void main(String[] args) {
		WorkThread workthreadA = new WorkThread("WorkthreadA");
		WorkThread workthreadB = new WorkThread("WorkthreadB");
		workthreadA.start();
		workthreadB.start();
		
		try {Thread.sleep(5000);}catch (InterruptedException e) {}
			workthreadA.work = false; //5초간 메인스레드 일시정지->AB번갈아 실행->A가 false가 되면서 B에게 실행양보
			
		try {Thread.sleep(10000);}catch (InterruptedException e) {}
			workthreadA.work = true; //10초간 메인 스레드 정지 -> A를 true 바꾸면서 AB번갈아 가면서 실행
	}

}
