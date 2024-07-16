package sec25;

public class CastingExample {

	public static void main(String[] args) {
		// 인터페이스 변수 선언과 구현 객체대입
		Vehicle ve = new Bus();
		
		// 인터페이스를 통해서 호출
		ve.run();
		
		// 강제 타입 변환 후 호출
		Bus bus = (Bus) ve; // 버스타입으로 ve를 강제변환(다운캐스팅)
		bus.run();
		bus.checkFare();
		

	}

}
