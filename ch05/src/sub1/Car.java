package sub1;

// 클래스 정의 : 이걸 통해서 객체를 만들어야 함
public class Car {
	
	// 속성(멤버변수)
	String name;
	String color;
	int speed;
	
	
	// 기능(멤버 메서드 static 안붙음)
	public void speedUp(int speed) {
		this.speed += speed; //this는 클래스(Car)를 지칭하며 속성인 스피드를 사용
	}
	public void speedDown(int speed){
		this.speed -= speed;
	}
	public void show() {
		System.out.println("차량명 : " + this.name);
		System.out.println("차량색 : " + this.color);
		System.out.println("현재속도 : " + this.speed);
	}
}
