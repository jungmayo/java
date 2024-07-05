package sec01;

public class SubStringExample {

	public static void main(String[] args) {
		String sn = "880815-1234567";
		String firstNum = sn.substring(1, 6); // 0인덱스부터 6인덱스앞까지 잘라낸, 즉 0~5인덱스까지의 값인  880815가 출력
		System.out.println(firstNum);
		String secondNum = sn.substring(7); //7인덱스부터 끝까지 잘라낸 값인 1234567이 secondnum에 담겨서 출력
		System.out.println(secondNum);

	}

}
