package sub4;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
 * 날짜 : 2024.07.1
 * 이름 : 정지현
 * 내용 : Set 실습하기
 */
public class SetTest {
	public static void main(String[] args) {
		
		//set 생성 (객체만 담을 수 있음)
		Set<Integer> set = new HashSet<>();
		
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(5);
		set.add(1);
		set.add(2);
		set.add(3); // 중복적으로 추가하는 호출은 무시됨 + 요소의 순서를 보장하지 않음
		System.out.println(set);
		
		// 반복자를 이용한 데이터 출력
		Iterator<Integer> it = set.iterator();
		while(it.hasNext()) { //다음 데이터가 있을 때까지 반복 실행
				System.out.print(it.next()+", "); 
			
		}
		System.out.println();
		
		// 반복문으로 데이터 출력
		for(int num : set) {
			System.out.print(num + ", ");
		}
	}
	//
}
