package sub4;
/*
 * 날짜 : 2024.07.22
 * 이름 : 정지현
 * 내용 : 스레드 제어 실습하기 교재 p617~619
 * 
 */

class WorkObject {
	public synchronized void methodA() { //동기화 메소드
		Thread thread = Thread.currentThread();
		System.out.println(thread.getName() + "methodA 작업 실행");
		
		notify(); // 다른 스레드를 실행상태로 전환 = 다른 스레드를 실행 대기 상태로 만듦 , 동기화 블럭에서만 실행됨(synchronize)
		
		try {
			wait(); // 자신의 스레드는 일시 정지 상태로 만듦
		} catch (InterruptedException e){
			
		}
	}

	public synchronized void methodB() { // 동기화 메소드
		Thread thread = Thread.currentThread();
		System.out.println(thread.getName() + "methodB 작업 실행");
		
		notify(); // 다른 스레드를 실행 대기 상태로 만듦
		
		try {
			wait(); // 자신의 스레드는 일시 정지 상태로 만듦
		} catch (InterruptedException e){
			
		}
	}
}
class ThreadA extends Thread{
	private WorkObject workObject;
	
	public ThreadA(WorkObject workObject) { // 공유 작업 객체를 받음
		setName("ThreadA"); // 스레드 이름 변경
		this.workObject = workObject;
	}
	
	@Override
	public void run() {
		for(int i = 0; i<10; i++) {
			workObject.methodA(); // 동기화 메소드 호출
		}
	}
}
class ThreadB extends Thread {
	private WorkObject workObject;
	
	public ThreadB(WorkObject workObject) { // 공유 작업 객체를 받음
		setName("ThreadB"); //스레드 이름 변경
		this.workObject = workObject;
	}
	
	@Override
	public void run() {
		for(int i = 0; i<10; i++) {
			workObject.methodB(); //동기화 메소드 호출
		}
	}
}

public class ThreadWaitNotifyTest {

	public static void main(String[] args) {
		WorkObject workObject = new WorkObject(); // 공유 작업 객체생성
		
		ThreadA threadA = new ThreadA(workObject);// 작업 스레드 생성 및 실행 ~
		ThreadB threadB = new ThreadB(workObject);
		
		threadA.start();
		threadB.start();// ~ 작업 스레드 생성 및 실행

	}

}
