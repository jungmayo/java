package test5;

/* 날짜 : 2024.08.01
 * 이름 : 정지현
 * 내용 : 자바 총정리 연습문제
 */

interface Shape {
	public double calcArea();
		
	}

class Circle implements Shape {
	private double radius;
	
	public Circle(double radius) {
		this.radius =radius;
	}
	
	@Override	
	public double calcArea() {
		return Math.PI * radius * radius;
	}
}

class Rectangle implements Shape {
	private double width;
	private double heigh;
	
	public Rectangle(double width, double heigh) {
		this.width = width;
		this.heigh = heigh;
	}
	
	@Override
	public double calcArea() {
		return width * heigh;
	}
	
}

public class Test10 {

	public static void main(String[] args) {
		Circle circle = new Circle(5.0);
		System.out.println("원 넓이 : ");
		System.out.println(circle.calcArea());
		
		Rectangle rectangle = new Rectangle(4.0, 6.0);
		System.out.println("직사강형 넓이 : ");
		System.out.println(rectangle.calcArea());

	}

}
