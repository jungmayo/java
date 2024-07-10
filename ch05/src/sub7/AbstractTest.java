package sub7;
/*
 * 날짜 : 2024.07.10
 * 이름 : 정지현
 * 내용 : 추상 클래스 실습
 */
public class AbstractTest {
	
	public static void main(String[] args) {
		
		//추상 클래스는 객체생성 X
		//Animal animal = new Animal();
		
		Animal tiger = new Tiger();
		Animal eagle = new Eagle();
		Animal shark = new Shark();
}
}
