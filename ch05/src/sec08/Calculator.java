package sec08;

// 234페이지 리턴값이 없는 메소드와 있는 메소드를 선언

public class Calculator {
	void powerOn() { //리턴값이 없는 메소드 선언
		System.out.println("전원을 켭니다");
	}
	void powerOff() {//리턴값이 없는 메소드 선언
		System.out.println("전원을 끕니다");
	}
	int plus(int x, int y) { //리턴 값이 있는 메소드 , 두 정수 값을 전달받고 호출한 곳으로 결과값 int를 리턴하는 메소드 선언
		int result = x + y;
		return result;
	}
	double divide(int x, int y) { //리턴 값이 있는 메소드, 호출한 곳으로 결과값 double을 리턴하는 메소드 선언
		double result = (double)x / (double)y;
		return result;
	}


	public static void main(String[] args) {
		Calculator myCalc = new Calculator();
		myCalc.powerOn();
	
		int result1 = myCalc.plus(5, 6);
		System.out.println("result1 : " + result1);
	
		int x = 10;
		int y = 4;
		double result2 = myCalc.divide(x, y);
		System.out.println("result2 : " + result2);
	
		myCalc.powerOff();
	}
}
