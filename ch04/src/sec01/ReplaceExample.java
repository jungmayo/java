package sec01;
/* 
 * 162페이지
 * 문자열 대체하기
 */
public class ReplaceExample {

	public static void main(String[] args) {
		String oldstr = "자바 문자열은 불변입니다. 자바 문자열은 String입니다.";
		String newstr = oldstr.replace("자바", "JAVA");
		
		System.out.println(oldstr);
		System.out.println(newstr);

	}

}
