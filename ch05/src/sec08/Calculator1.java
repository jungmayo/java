package sec08;

public class Calculator1 {

	double area(double x) {
	double result = x * x;
	return result;
	}
	double area(double x, double y) {
		double result1 = x * y;
		return result1;
	}

public static void main(String[] args) {
	Calculator1 ca = new Calculator1();
	
	double result1 = ca.area(3);
	System.out.println("정사각형의 넓이 : " + result1);
}
}


