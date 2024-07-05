package test1;
/*
 * 날짜 : 2024.07.03
 * 이름 : 정지현
 * 내용 : 자바 반복문 연습문제
 */
public class Test08 {

	public static void main(String[] args) {
		int n = 5; //줄 수
		
		for(int i = 0; i<n; i++) { // 총 5줄을 만들기 위한 바깥 for문
		
			for(int j=n-1; j>i; j--) { // 공백을 만들기 위한 첫번째 for문
				System.out.print(" ");
			}
			for(int j=0; j<=i*2; j++) { // 별을 만들기 위한 두번째 for문
				System.out.print("*");
			}
			System.out.print("\n"); // 다음줄로 줄바꿈을 위한 출력값
		}
		
	}

}
