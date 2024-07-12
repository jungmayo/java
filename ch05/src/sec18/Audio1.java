package sec18;

public class Audio1 implements RemoteControl1{

	public int volume;
	
	public void turnOn() {
		System.out.println("Audio를 켭니다.");
	}
	public void turnOff() {
		System.out.println("Audio를 끕니다");
	}
	public void setVolume(int volume) {
		if(volume>RemoteControl1.MAX_VOULME) {
			this.volume = RemoteControl1.MAX_VOULME;
		}else if(volume<RemoteControl1.MIN_VOULME) {
			this.volume = RemoteControl1.MIN_VOULME;
		}else {
			this.volume = volume;
		}
		System.out.println("현재 Audio 볼륨 : " + this.volume);
	}

}