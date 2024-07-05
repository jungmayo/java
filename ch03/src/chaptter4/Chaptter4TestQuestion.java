package chaptter4;

public class Chaptter4TestQuestion {

	public static void main(String[] args) {
		int total = 0;
		for(int a=1; a<=100; a++) {
			if(a%3 == 0) {
				total += a;
			}
		}
		System.out.println("3의 배수의 총 합은 : " + total);
	}

}
