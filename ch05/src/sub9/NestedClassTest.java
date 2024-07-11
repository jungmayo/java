package sub9;
/*
 * 날짜 : 2024.07.11
 * 이름 : 정지현
 * 내용 : 중첩 클래스 실습하기
 */

//외부 클래스
class outer{
	private int x;
	public outer(int x) {
		this.x = x;
	}
	public void show() {
		System.out.println("Outer x : " + x);
	}

	//내부 클래스
	class Inner{
		private int x;
		public Inner(int x) {
			this.x = x;
		
		}
		public void show() {
			System.out.println("inner x :" + x);
		}
	}
}
interface Person{
	public void hello();
	
}
	
	
	
	
public class NestedClassTest {
	public static void main(String[] args) {
		
		// 외부 객체 생성
		outer out = new outer(1);
		out.show();
		
		// 내부 객체 생성
		outer.Inner inn = out.new Inner(2);
		inn.show();
		
		//익명 개체 실습 - 인터페이스를 클래스 구현없이 바로 new 생성한 객체
		Person p = new Person() {
			
			@Override
			public void hello() {
				System.out.println("Person hello");
				
			}
		};
		p.hello();
		}
}
