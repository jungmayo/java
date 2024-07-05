package test2;

import java.util.Arrays;

/* 날짜 : 2024.07.05
 * 이름 : 정지현
 * 내용 : 자바 배열 문자 출력 연습문제 length - 10 / 인덱스 9
 */
public class Test04 {

	public static void main(String[] args) {
		char str[] = {'I',' ','L','O','V','E',' ','Y','O','U'};
		int row, col;
		
		for (row = 1; row < 10; row++) {
			for (col = 0; col <= row; col++) {
				System.out.print(str[col]);
			}
			System.out.print("\n");
			//System.out.print(Arrays.toString(arr)); -> 배열문 통째로 출력
		}

	}/*정답 : 1라운드 : 1 4 2 5 3
	2라운드 : 1 2 4 5 3
	3라운드 : 1 2 3 5 4
	4라운드 : 1 2 3 4 5
	정답 : arr[j] = arr[i];
	      (int n : arr)
*/
}
