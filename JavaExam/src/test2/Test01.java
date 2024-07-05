package test2;

/* 날짜 : 2024.07.05
 * 이름 : 정지현
 * 내용 : 자바 배열 문자 출력 연습문제 length - 10 / 인덱스 9
 */
public class Test01 {

	public static void main(String[] args) {
		char str[] = {'I',' ','L','O','V','E',' ','Y','O','U'};
		int row, col;
		
		for (row = 1; row < 10; row++) {
			for (col = 0; col <= row; col++) {
				System.out.print(str[col]); // 인덱스 순서대로 반복 
			}
			System.out.print("\n");
		}

	}

}
