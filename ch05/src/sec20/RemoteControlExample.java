package sec20;

public class RemoteControlExample {

	public static void main(String[] args) {
		RemoteControl rc = new Television();
		rc.turnOn();
		rc.setVolume(5);
		
		rc.setMute(true);
		rc.setMute(false);
		
		RemoteControl ad = new Audio();
		ad.turnOn();
		ad.setVolume(6);
		ad.setMute(true);
		ad.setMute(false);
	}

}
