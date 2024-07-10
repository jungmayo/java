package sub5;

// 클래스 정의 : 이걸 통해서 객체를 만들어야 함
public class Car {
	
	// 속성(멤버변수) (클래스 속성은 무조건 private 선언!) // 상속관계에서 자식클래스에서 (접근)참조할 수 있게 private에서 protected로 변경
	protected String name;
	protected String color;
	protected int speed;
	
	
	//생성자 (constructor 프라이빗된 속성들을 초기화하여 사용하기 위해서) : 캡슐화된 클래스 속성을 초기화 하는 메서드
	public Car(String name, String color, int speed) {
		this.name = name;
		this.color = color;
		this.speed = speed;
		
	}
	// Setter : 캡슐화된 속성에 대한 추가적인 수정을 위한 메서드
		
		public void setColor(String color) {
			this.color = color;
		}
	// Getter : 캡슐화된 속성에 대한 추가적인 수정을 위한 메서드	
		public String getColor() {
			return color;
		}
		
	// 기능(멤버 메서드 static 안붙음)
	public void speedUp(int speed) {
		this.speed += speed; //this는 클래스(Car)를 지칭하며 속성인 스피드를 사용
	}
	public void speedDown(int speed){
		this.speed -= speed;
	}
	public void  show() {
		System.out.println("차량명 : " + this.name);
		System.out.println("차량색 : " + this.color);
		System.out.println("현재속도 : " + this.speed);
	}
}
