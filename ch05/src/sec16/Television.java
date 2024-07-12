package sec16;

public class Television implements RemoteControl{
		public void turnOn() {
			System.out.println("TV를 켭니다");
		}
}
class Audio implements RemoteControl{
		public void turnOn() {
			System.out.println("오디오를 켭니다");
		}

	public static void main(String[] args) {
		RemoteControl re = new Television();
		re.turnOn();
		
		RemoteControl as = new Audio();
		as.turnOn();

	}

}
