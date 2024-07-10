package sec09;

public class SmartPhoneExample {

	public static void main(String[] args) {
		//smarphone 객체생성
		SmartPhone myPhone = new SmartPhone("갤럭시","은색");
		
		//phone으로 상속받은 필드읽기
		System.out.println("모델 : " + myPhone.model);
		System.out.println("색깔 : " + myPhone.color);
		//smartphone으로 상속받은 필드읽기
		System.out.println("와이파이 상태 : " + myPhone.wifi);
		//phone으로부터 상속받은 메소드 호출
		myPhone.bell();
		myPhone.sendVoice("여보세요");
		myPhone.receiveVoice("안녕하세요 저는 정마요인데요");
		myPhone.sendVoice("아 네 반갑습니다");
		myPhone.hangup();
		
		//Smartphone의 메소드 호출
		myPhone.setWifi(true);
		myPhone.internet();
	}

}
