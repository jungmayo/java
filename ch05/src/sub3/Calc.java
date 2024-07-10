package sub3;

public class Calc {
	
	//싱글톤 객체
	private static Calc instance = new Calc(); // 클래스 안에서 객체 생성
	public static Calc getInstance() {
		return instance;
	}
	private Calc() {} // 프라이빗 생성자, 외부에서 calc를 생성할 수 있는걸 막아놓음
	
	
	public int plus(int x, int y) {
		return x + y;
	}
	public int minus(int x, int y) {
		return x - y;
	}
	public int multi(int x, int y) {
		return x * y;
	}
	public int div(int x, int y) {
		return x / y;
	}
	
}
