package sec24;

public class PromotionExample {

	public static void main(String[] args) {
		// 구현 객체 생성
		
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		//인터페이스 변수 선언
		A a =b; // b 라는 객체를 인터페이스 A 타입으로 형변환하여 a라는 변수에 저장, 인터페이스 A에 있는 메소드만 호출 가능
		
		a= c; // 위와 동일
		a= d;
		a= e;

	}

}
