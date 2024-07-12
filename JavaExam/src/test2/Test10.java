package test2;

/* 날짜 : 2024.07.05
 * 이름 : 정지현
 * 내용 : 자바 배열 문자 출력 연습문제 length - 10 / 인덱스 9
 */
public class Test10 {

	public static void main(String[] args) {
		for(int i=2; i<=9; i++) {
			System.out.println(i + "단");
		
			for(int j=1; j<=9; j++) {
				int z = i*j;
				System.out.println(i + "x" + j +" = "+ z);
			}
			
		}
		
	}

}
