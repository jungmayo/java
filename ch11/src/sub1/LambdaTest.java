package sub1;
/*
 * 날짜 : 2024.07.23
 * 이름 : 정지현
 * 내용 : 자바 람다식 실습하기
 */

interface Person{
	public void hello();
} //객체지향이면 클래스로 구현해야함

class Student implements Person{
	@Override
	public void hello() {
		System.out.println("Hello Student!");
		
	}
}
//람다식으로 정의할 인터페이스 선언 어노테이션
@FunctionalInterface
interface A {
	public int method(int a, int b); //람다식으로 사용할 때 추상메서드는 하나만 존재해야함, 클래스로 활용못하게 @FunctionalInterface 걸어주는 것이 좋음
}
@FunctionalInterface
interface B{
	public void method(double a);
}
@FunctionalInterface
interface C{
	public boolean method();
}
@FunctionalInterface
interface M{
	public double func(double num);
}




public class LambdaTest {
	public static void main(String[] args) {
		
		//객체지향 프로그래밍
		Person student = new Student();
		student.hello();
		
		//함수형 프로그래밍(람다식활용)
		Person teacher = () -> { 
			System.out.println("Hello Teacher"); //Person의 hello를 람다식으로 구현
		};
		
		teacher.hello();
		
		//1. A interface 람다식 예제
		//(위의 타입과 맞춰줘야함, 꼭 a나 b라고 쓸 필요는 없음)
		A a1 = (int a, int b) -> {
			int c = a + b;
			return c;
		};
		/*위와 동일*/	
		A a2 = (a, b) -> {
			return a + b;
		};
		/*위와 동일*/
		A a3 = (a,b)-> a+b; /*중괄호 생략하면 return이라는 의미*/
		
		int r1 = a1.method(1, 2);
		int r2 = a2.method(2, 3);
		int r3 = a3.method(3, 4);
		
		System.out.println("r1 : " + r1);
		System.out.println("r2 : " + r2);
		System.out.println("r3 : " + r3);
		
		
		
		
		
		//2. B interface 람다식 예제
		B b1 = (double a)-> {
			System.out.println("a : " + a);
		};
		
		/*위와 동일*/
		B b2 = a -> System.out.println("a :" + a);
		
		/*위와 동일, :: -> 람다식임*/ 
		B b3 = System.out::println; //메소드 참조연산자(::)
		
		b1.method(1.0);
		b2.method(2.0);
		b3.method(3.0);
		
		
		
		
		
		//3. C interface 람다식 예제
		
		C c1 = ()->{return true;};
		C c2 = ()-> false;;
		
		System.out.println("c1 : " + c1.method());
		System.out.println("c2 : " + c2.method());
		
		
		
		//람다식을 활용한 수학 클래스
		M m1 = Math::ceil;
		M m2 = Math::floor;
		M m3 = Math::round;
		
		System.out.println("올림값 : " + m1.func(1.2));
		System.out.println("내림값 : " + m2.func(1.2));
		System.out.println("반올림 : " + m3.func(1.2));
	}

}
