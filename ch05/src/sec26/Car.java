package sec26;

public class Car {
	Tire t1 = new HankkokTire();
	Tire t2 = new HankkokTire();
	
	public void run() {
		t1.roll();
		t2.roll();
	}
}
