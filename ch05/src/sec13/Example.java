package sec13;

public class Example {

	public static void main(String[] args) {
		SuperAirplain su = new SuperAirplain();
		su.takeOff();
		su.fly();
		su.flymode = SuperAirplain.SUPERSONIC;
		su.fly();
		su.flymode = SuperAirplain.NORMAL;
		su.fly();
		su.land();

	}

}
