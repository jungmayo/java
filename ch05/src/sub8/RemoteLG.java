package sub8;

public class RemoteLG implements RemoteControl {
//구현해야 하기때문에 리모트컨트롤의 메서드를 사용해야 함
	@Override
	public void powerOn() {
		System.out.println("LG powerOn...");
		
	}

	@Override
	public void powerOff() {
		System.out.println("LG powerOff...");
		
	}

	@Override
	public void chUp() {
		System.out.println("LG chUp...");
		
	}

	@Override
	public void chDown() {
		System.out.println("LG chDown...");
		
	}

	@Override
	public void soundUp() {
		System.out.println("LG soundUp...");
		
	}

	@Override
	public void soundDown() {
		System.out.println("LG soundDown...");
		
	}
//
}
