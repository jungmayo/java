package sec1;

class SumThread extends Thread{
	private long sum;
	
	public long getSum() {
		return sum;
	}
	public void setSum(long sum) {
		this.sum = sum;
	}
	@Override
	public void run() {
		for(int i = 0; i<=100; i++) {
			sum +=i;
		}
	}
}
public class JoinExample {

	public static void main(String[] args) {
		SumThread sumthread = new SumThread();
		sumthread.start();
		try {
			sumthread.join(); // 메인메서드 잠시 일시정지 , sumthread가 끝날때까지
		}catch(InterruptedException e) {	
		}
		System.out.println("1~100 합 : " + sumthread.getSum());
	}

}
// sumthread가 계산 작업을 모두 마칠 때까지 메인 스레드가 일시정지 상태에 있다가 최종 계산된 결과값을 산출하고 종료하면 
//메인 스레드가 결과값을 받아 출력함
