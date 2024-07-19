package sub3;

import java.util.ArrayList;
import java.util.List;

import sub1.Apple;

/*
 * 날짜 : 2024.07.17
 * 이름 : 정지현
 * 내용 : ArrayList 실습하기 (제네릭 컬렉션 프레임 워크에 포함)
 * 
 */
public class ArrayListTest {

	public static void main(String[] args) {
		
		// ArrayList 생성
		List<Integer> list = new ArrayList<>(); //객체만 취급 // 앞 List는 인터페이스,컬렉션 다형성
		
		// 데이터 저장
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		System.out.println(list);
		
		//데이터 삽입
		list.add(1, 6);//앞은 인덱스, 뒤는 데이터
		System.out.println(list);
		
		//데이터 제거
		list.remove(2); //인덱스 2번 제거
		list.remove(3);
		System.out.println(list);
		
		//데이터 출력
		System.out.println("list 1번째 윈소 : " + list.get(0)); //특정 인덱스를 출력
		System.out.println("list 2번째 윈소 : " + list.get(1));
		System.out.println("list 4번째 윈소 : " + list.get(3));
		
		// 리스트 크기 (배열의 length)
		System.out.println("list 크기 : " + list.size());
		
		//리스트 반복문
		for(int num : list) { //Integer로 써도됨 / int로 썼을경우 auto_unboxing
			System.out.print(num + ", ");
		}
		System.out.println();
		
		//
		
		List<String> people = new ArrayList();
		
		people.add("김유신");
		people.add("김춘추");
		people.add("장보고");
		people.add("강감찬");
		people.add("이순신");
		
		System.out.println(people);
		
		//
		//마지막에 '정약용'추가
		people.add("정약용");
		System.out.println(people);
		
		//강감찬 - 이순신 사이에 '이성계' 삽입
		people.add(4, "이성계");
		System.out.println(people);
		
		//김유신 - 김춘추 사이에 '선덕여왕' 삽입
		people.add(people.indexOf("고양이"),"강아지"); //고양이 자리의 인덱스 번호에 강아지를 add
		
		//'장보고' 제거 후 '왕건' 삽입
		people.remove(people.indexOf("장보고"));
		System.out.println(people);
		
		people.add(people.indexOf("강감찬"), "왕건");
		System.out.println(people);
		
		// '이성계'를 '정도전'으로 교체
		people.set(5, "정도전");
		
		
		// 객체 리스트 // Apple 객체를 저장할 arraylist 생성
		List<Apple> apples = new ArrayList<>();
		
		Apple a1 = new Apple("한국", 3000);
		Apple a2 = new Apple("미국", 2000);
		
		apples.add(a1);
		apples.add(a2);
		apples.add(new Apple("일본", 1000));
		
		//한국 사과 출력
		Apple appleKorea = apples.get(0);
		System.out.println(appleKorea);
		
		//일본 사과 출력
		Apple applejapan = apples.get(2);
		System.out.println(applejapan);
		
	}

}
