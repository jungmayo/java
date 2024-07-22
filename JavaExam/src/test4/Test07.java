package test4;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/*
 * 날짜 : 2024.07.19
 * 이름 : 정지현
 * 내용 : 로또번호 연습문제
 */
public class Test07 {

	public static void main(String[] args) {

		for(int count=1; count <=5; count++) {
			System.out.println(makeLotto());
		}

	}
	public static Set<Integer> makeLotto() {
		Set<Integer> lottoset = new HashSet<>();
		
		for(;;) { //무한루프
			int num = (int)(Math.random()*45 +1);
			// (int)Math.ceil(Math.random()*45); 이렇게도 가능
			
			lottoset.add(num);
			
			if(lottoset.size() == 6) {
				break;
			}
		}
		//정렬을 위해 treeSet 사용(순서대로 나타낼 수 있도록하는 클래스)
		Set<Integer> treeSet = new TreeSet<Integer>(lottoset);
		
		return treeSet;
	
	}
}
