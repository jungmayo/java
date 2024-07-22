package sec1;

import java.awt.Toolkit;

//메인 스레드가 프린팅을 담당하고 비프음을 들려주는 것은 작업 스레드가 처리 하는 것
public class BeepPrintExample {

	public static void main(String[] args) {
		Thread thread = new Thread(new Runnable() { // 작업스레드 생성
			
			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit(); // 추상클래스이므로 직접 인스턴스 생성 불가, 메서드를 통해 간접적으로 인스턴스를 얻음
				for(int i=0; i<5; i++) {
					toolkit.beep();
					try {Thread.sleep(500); }catch(Exception e) {}
				}
				
			}
		});
		thread.start(); // 작업 스레드 실행
		for(int i = 0; i<5; i++) { // 메인 스레드가 실행하는 코드 (띵)
			System.out.println("띵");
			try {
				Thread.sleep(500);
			}catch(Exception e) {}
		}
	}

}
