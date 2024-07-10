package sec15;

public class Example {

	public static void main(String[] args) {
		Car ca = new Car();
		
		Tire a1 = new Tire();
		a1.roll();
		ca.tire = new GmTire();
		ca.run();
		ca.tire = new HoTire();
		ca.run();
		
		

	}

}
