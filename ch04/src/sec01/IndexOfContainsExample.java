package sec01;

public class IndexOfContainsExample {

	public static void main(String[] args) {
		String subject = "자바 프로그래밍";
		
		int location = subject.indexOf("프로그래밍"); //프로그래밍이 시작되는 인덱스가 3이므로 3을 출력한다.
		System.out.println(location);
		String substring = subject.substring(location);
		System.out.println(substring);
		
	}

}
