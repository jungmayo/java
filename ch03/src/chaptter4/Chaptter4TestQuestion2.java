package chaptter4;

public class Chaptter4TestQuestion2 {

	public static void main(String[] args) {
		boolean a = true;
		while(a) {
			int num1 = (int)(Math.random()*6) + 1;
			int num2 = (int)(Math.random()*6) + 1;
			System.out.println("(" + num1 + "," + num2 + ")");
		
		
		
		a = (num1+num2) != 5;
		}

	}

}
