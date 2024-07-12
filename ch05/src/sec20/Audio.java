package sec20;

public class Audio implements RemoteControl {
	private int volume;
	
	public void turnOn() {
		System.out.println("오디오를 켭니다");
	}
	public void turnOff() {
		System.out.println("오디오를 끕니다.");
	}
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}else if(volume<RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}else
			this.volume = volume;
		System.out.println("현재 Audio 볼륨 : " + this.volume);
	}
	
	private int memoryVolume;
	
	public void setMute(boolean mute) {
		if(mute) {
			this.memoryVolume = this.volume;
			System.out.println("무음 처리 합니다.");
			this.volume = RemoteControl.MIN_VOLUME;
		}else {
			System.out.println("무음 해제합니다.");
			setVolume(this.memoryVolume); // 뮤트가 false일 경우 원래 볼륨으로 복원하는 코드
		}
	}
}
