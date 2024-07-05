package chaptter4;

public class Question364 {

	public static void main(String[] args) {
		for(int a=2; a<=9; a++) {
			System.out.println(a + "단");
			for(int b=1; b<=9; b++) {
				int z = a*b;
				System.out.println(a+"x"+b+"="+z);
			}
		}
	}
}