package sub3;

/*
 * 날짜 : 2024.07.02
 * 이름 : 정지현
 * 내용 : java 메서드 타입 실습하기
 */
public class MethodTypeTest {

	public static void main(String[] args) {
		double math = type1(3);
		System.out.println("반지름의 길이가 3인 원의 넓이 : " + math);
		type2(type3());
		// type2는 리턴값 x -> 메인메소드에 활용 x
		// 리턴값이 있는 type3을 2에 대입 / 리턴값을 매개변수로 활용하여 type2를 계산
		boolean x = type3();
		type2(x);
		type4();
	}
	// 타입1. 매개변수 O, 리턴값 O
	public static double type1(double x) {
		
		double y = (x * x) * Math.PI;
		
		return y;
	}
	// 타입2. 매개변수 O, 리턴값 x
	public static void type2(boolean status) {
		if(status) {
			System.out.println("참 입니다.");
		}else {
			System.out.println("거짓 입니다.");
		}
	}
	// 타입3. 매개변수 x, 리턴값 O
	public static boolean type3() {
		int num1 = 1;
		int num2 = 2;
		
		if(num1> num2) {
			return true;
		}else {
			return false;
		}
	}
	// 타입4. 매개변수 x, 리턴값 x
	public static void type4() {
		double result = type1(5.0);
		System.out.println("반지름 길이가 5인 원의 넓이 : " + result);
	}
}
