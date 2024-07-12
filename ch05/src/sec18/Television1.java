package sec18;

public class Television1 implements RemoteControl1 {
	
	private int volume;
	
	public void turnOn() {
		System.out.println("TV를 켭니다");
	}
	public void turnOff() {
		System.out.println("TV를 끕니다");
	}
	public void setVolume(int volume) {
		if(volume>RemoteControl1.MAX_VOULME) {
			this.volume = RemoteControl1.MAX_VOULME;
		}else if(volume<RemoteControl1.MIN_VOULME) {
			this.volume = RemoteControl1.MIN_VOULME;
		}else {
			this.volume = volume;
		}
		System.out.println("현재 TV 볼륨 : " + this.volume);
	}
}
