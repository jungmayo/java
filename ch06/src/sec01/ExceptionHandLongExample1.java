package sec01;

public class ExceptionHandLongExample1 {
// 468페이지
	
	public static void printLength(String data) {
		
		try {
		int result = data.length(); //data가 null일 경우 NullpointerException 발생
		System.out.println("문자 수 : " + result);
		}catch(NullPointerException e) {
			System.out.println(e.getMessage()); //예외가 발생한 이유만 리턴
			//System.out.println(e.toString()); // 예외의 종류도 함께 리턴
			//System.out.println(e.printStackTrace()); // 예외가 어디서 발생했는지 추적한 내용까지도 출력
			
		}finally {
			System.out.println("[마무리 실행]\n");
		}
	}
	public static void main(String[] args) {
		System.out.println("[프로그램 시작]\n");
		printLength("ThisisJava");
		printLength(null);
		System.out.println("[프로그램 종료]");

	}

}
