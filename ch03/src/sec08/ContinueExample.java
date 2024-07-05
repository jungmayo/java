package sec08;

public class ContinueExample {
	public static void main(String[] args) throws Exception {
		for(int i=1; i<=10; i++) {
			if(i%2 != 0) { //홀수면 참이라서 continue를 통해 for문으로 들어감 반복했을때 2는 참이 아니기때문에 바로 시스아웃으로 출력
				continue;
			}
			System.out.print(i + " ");
		}

	}

}
