package step1;

import java.util.Scanner;

public class Test08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int Z = A - 543;
		
		System.out.printf("%s의 서기연도는 %d입니다",A,Z);
		sc.close();
	}

}
