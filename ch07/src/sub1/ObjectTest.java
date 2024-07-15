package sub1;

/*
 * 날짜 : 2024.07.15
 * 이름 : 정지현
 * 내용 : 자바 Object 클래스 실습하기 
 */
public class ObjectTest {
	public static void main(String[] args) {
		
		Apple a1 = new Apple("한국" , 3000);
		Apple a2 = new Apple("일본" , 2000);
		
		// 객체 정보 조회 - toString()
		// Apple 클래스에 toString 메소드없으면 주소값만 출력..?됨
		System.out.println(a1.toString());
		System.out.println(a2); //toString()을 기재안해도 호출 됨 (위와 동일)
		
		
		// 객체 비교 - equals() heap영역의 주소가 각각 다르기때문에
		if(a1 == a2) {
			System.out.println("a1, a2가 주소값(참조값) 같다");
		}else {
			System.out.println("a1, a2가 주소값(참조값) 다르다.");
		}
		
		if(a1.equals(a2)) { //문자열 비교할때는 이걸로 써야함
			System.out.println("a1, a2가 객체 같다");
		}else {
			System.out.println("a1, a2가 객체가 다르다.");
			
		}
		
		// 객체 해시값 (객체를 구분하는, 중복되지 않는 고유한 값)
		System.out.println("a1 해시값 : " + a1.hashCode());
		System.out.println("a2 해시값 : " + a2.hashCode());
	}
}
