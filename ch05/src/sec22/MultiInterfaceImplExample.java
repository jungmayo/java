package sec22;

public class MultiInterfaceImplExample {

	public static void main(String[] args) {
		RemoteControl re = new SmartTelevision();
		re.turnOn();
		re.turnOff();
		
		Searchable se = new SmartTelevision();
		se.search("https://www.youtube.com");

	}

}
