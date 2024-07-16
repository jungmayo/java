package sec23;

public class ExtendsExample { // 인터페이스 상속

	public static void main(String[] args) {
		InterfaceImpl im = new InterfaceImpl();
		
		InterfaceA ia = im; //형변환
		ia.methodA();
		
		InterfaceB ib = im;
		ib.methodB();
		
		InterfaceC ic = im;
		ic.methodA();
		ic.methodB();
		ic.methodC();

	}

}
