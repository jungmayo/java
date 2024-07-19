package test4;

/*
 * 날짜 : 2024.07.19
 * 이름 : 정지현
 * 내용 : 자바 문자열 연습문제
 */
public class Test04 {

	public static void main(String[] args) {
		
		String fileName = "HelloWorld.java";
		
		int idx = fileName.lastIndexOf(".");
				
		String title = fileName.substring(0, idx);
		String ext = fileName.substring(idx+1);
		
		System.out.println("파일명 : " + title);
		System.out.println("확장자 : " + ext);
		
		String strScores = "60, 72, 82, 86, 92";
		String[] scores = strScores.split(","); //문자열 분할
				
		int total = 0;
		
		for(String score : scores) {
			total += Integer.parseInt(score.trim()); //숫자로 변환 , trim 공백 짜름
		}
		System.out.println("strScores 총점 : " + total);
	}

}
