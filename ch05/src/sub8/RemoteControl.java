package sub8;



public interface RemoteControl {

	
	public abstract void powerOn(); // 추상 메서드
	//public void powerOn(); -> 완전한 메서드
	public void powerOff();
	public void chUp(); // abstract 생략 가능
	public void chDown();
	public void soundUp();
	public void soundDown();

}
