package sec18;

public interface RemoteControl1 {

	int MAX_VOULME = 10;
	int MIN_VOULME = 0;
	
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
}
