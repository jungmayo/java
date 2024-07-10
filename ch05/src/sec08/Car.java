package sec08;

/*228페이지  생성자 오버로딩 : 매개변수를 달리하는 생성자를 여러 개 선언하는 것
 * 매개값의 타입과 수에 따라 실행될 생성자가 결정된다
 */
public class Car {
	// 필드 선언
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	// 생성자 선언
	Car(){}
	
	Car(String model){
		this.model = model; // 필드 초기화
	}
	Car(String model, String color){
		this.model = model;
		this.color = color;
	}
	Car(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	public static void main(String[] args) {
		Car car1 = new Car();
		System.out.println("car1.company : " + car1.company);
		System.out.println();
		
		Car car2 = new Car("자가용");
		System.out.println("car2 company : " + car2.company);
		System.out.println("car2 model : " + car2.model);
		System.out.println();
		
		Car car3 = new Car("자가용","검정");
		System.out.println("car3 company : " + car3.company);
		System.out.println("car3 model : " + car3.model);
		System.out.println("car3 color : " + car3.color);
		System.out.println();
		
		Car car4 = new Car("택시", "빨강", 200);
		System.out.println("car4 company :" + car4.company);
		System.out.println("car4 model :" + car4.model);
		System.out.println("car4 color :" + car4.color);
		System.out.println("car4 maxSpeed :" + car4.maxSpeed);
		System.out.println();
	}
}



