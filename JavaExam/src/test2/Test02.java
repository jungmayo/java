package test2;

/* 날짜 : 2024.07.05
 * 이름 : 정지현
 * 내용 : 자바 배열 문자 출력 연습문제 length - 10 / 인덱스 9
 */
public class Test02 {

	public static void main(String[] args) {
		int arr[] = {17,92,18,33,58,7,26,42};
		int maxNum = arr[0]; // 초기 최대값을 설정하는 작업
		
		for (int i = 0; i < 8; i++) { //반복문 안에 if / if가 참이면  = arr[i]로 초기화
			if (maxNum < arr[i]) { 
				maxNum = arr[i];
			}
		}
		System.out.print("배열 arr에서 가장 큰 수 : " + maxNum);
	}

}
