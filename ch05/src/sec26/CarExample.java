package sec26;

public class CarExample {

	public static void main(String[] args) {
		//자동차 객체 생성
		Car car = new Car();
		
		// car의 run 메소드 실행 (car는 한국타이어로 객체 생성되어있음)
		
		car.run();
		
		// 타이어 객체 교체
		car.t1 = new KumhoTire();
		car.t2 = new KumhoTire();
		
		car.run();

	}

}
