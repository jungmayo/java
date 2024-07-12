package test2;

import java.util.Arrays;

/* 날짜 : 2024.07.05
 * 이름 : 정지현
 * 내용 : 자바 배열 문자 출력 연습문제 length - 10 / 인덱스 9
 */
public class Test04 {

	public static void main(String[] args) {
		int arr[] = {4, 2, 1, 5, 3};
		for(int i = 0; i<4; i++) {
			for (int j = i+1; j<5; j++) {
				if(arr[i]> arr[j]) {
					int temp = arr[j];
					arr [j] = arr[i];
					arr[i]= temp;
				}
			}
		}
	
		for(int n : arr) {
			System.out.print(n + " ");
		}
	}/*정답 : 1라운드 : 1 4 2 5 3
	2라운드 : 1 2 4 5 3
	3라운드 : 1 2 3 5 4
	4라운드 : 1 2 3 4 5
	정답 : arr[j] = arr[i];
	      (int n : arr)
*/
}
