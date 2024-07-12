package sec21;

public class RemoteControlExample {

	public static void main(String[] args) {
		//인터페이스 변수 선언
		RemoteControl rc = new Television();
		rc.turnOn();
		rc.setVolume(5);
		rc.setMute(true);
		rc.setMute(false);
		System.out.println();
		RemoteControl.changeBattery();

	}

}
