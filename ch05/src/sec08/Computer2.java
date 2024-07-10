package sec08;

public class Computer2 {

	int sum(int ...values) {
		int sum = 0;
		
		for(int i=0; i<values.length; i++) {
			sum += values[i];
					
		}
		return sum;
	}
public static void main(String[] args) {
		Computer2 co = new Computer2();
		int result1 = co.sum(1,2,3);
		System.out.println(result1);
		
		int [] cat = {1,2,3,4,5};
		int result3 = co.sum(cat);
		System.out.println(result3);
		
		int result4 = co.sum(new int[] {1,2,3});
		

}




}
