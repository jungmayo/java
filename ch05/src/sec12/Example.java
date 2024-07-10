package sec12;

public class Example {

	public static void main(String[] args) {
		
		int r = 10;
		
		Calculator ca = new Calculator();
		Computer co = new Computer();
		
		System.out.println("원 면적 : " + co.areaCircle(r));
		System.out.println("원 면적 : " + ca.areaCircle(r));
	}

}
