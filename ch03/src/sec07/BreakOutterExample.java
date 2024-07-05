package sec07;
// 137페이지
public class BreakOutterExample {

	public static void main(String[] args) throws Exception {
		outter : for(char upper = 'A'; upper<='Z'; upper++) {
			for(char lower = 'a'; lower<='z'; lower++) {
				System.out.println(upper + "-" + lower);
				if(lower=='g') {
					break outter;
				}
			}
		}

	}

}
// outter를 통해서 안쪽 for문뿐만아니라 바깥쪽 for문도 빠져나옴