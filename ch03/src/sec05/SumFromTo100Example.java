package sec05;
//132페이지
public class SumFromTo100Example {

	public static void main(String[] args) {
		int sum = 0;
		int i = 1;
		while(i<=100) {
			sum += i;
			i++;
		}
		System.out.println("1부터 100까지의 합" + sum);

	}

}
