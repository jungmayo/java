package sub2;
/*
 * 날짜 : 2024.07.16
 * 이름 : 정지현
 * 내용 : String builder 클래스 실습하기
 * 
 */
public class StringBuilderTest {

	public static void main(String[] args) {
		
		// String 불변(immutable) 문자열 특성 / 객체내에 저장된 내용 변경 X
		String str = "Java";
		System.out.println("str 주소 :" + System.identityHashCode(str));
		
		str += "Programming";
		System.out.println("str 주소 :" + System.identityHashCode(str));
		
		System.out.println("str :" + str);
		
		//String 불변 특성을 개선한 String Builder
		StringBuilder sb = new StringBuilder("Java");
		System.out.println("sb 주소 : " + System.identityHashCode(sb));
		
		
		sb.append("programing");
		System.out.println("sb 주소 : " + System.identityHashCode(sb));
		
		System.out.println("sb : " + sb);
	}

}
