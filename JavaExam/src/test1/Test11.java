package test1;
/*
 * 날짜 : 2024.07.03
 * 이름 : 정지현
 * 내용 : 자바 반복문 연습문제
 */
public class Test11 {

	public static void main(String[] args) {
		for(int a = 2; a<=9; a++) {
			System.out.println(a + "단");
			for(int b = 1; b<=9; b++) {
				int z = a * b;
				System.out.println(a + "x" + b + "=" + z);
			}
		}
	}
}

