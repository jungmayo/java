package sec08;

public class CarExample {
 String model;
 int speed;
 
 CarExample(String model){
	 this.model = model;
 }	 
	void setSpeed(int speed) {
		this.speed = speed;
	}
	void run() {
		this.setSpeed(30);
		System.out.println(this.model + "가 달립니다.(시속 : " + this.speed+"km/h)");
	}

public static void main(String[] args) {
	CarExample ca = new CarExample("포르쉐");
	ca.setSpeed(100);
	ca.run();
	}
}
