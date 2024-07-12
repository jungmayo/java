package sec19;

public class RemoteControlExample {

	public static void main(String[] args) {
		RemoteControl tv = new Television();
		RemoteControl ad = new Audio();
		
		tv.turnOn();
		tv.setVolume(5);
		tv.turnOff();
		
		ad.turnOn();
		ad.setVolume(3);
		ad.turnOff();
	}

}
