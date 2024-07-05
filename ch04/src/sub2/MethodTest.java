package sub2;

/*
 * 날짜 : 2024.07.02
 * 이름 : 정지현
 * 내용 : java 메소드 실습하기
 */
public class MethodTest {
	
	//메인 메소드 - 프로그램 진입점
	public static void main(String[] args) {
		
		//메서드 호출(call)
		int y1= f(1); //인자값 1을 전달해서 f메서드 호출
		int y2= f(2);
		int y3= f(3);
		System.out.println("y1 : " + y1);
		System.out.println("y2 : " + y2);
		System.out.println("y3 : " + y3);
		
		
		int total1 = sum(1,100);
		System.out.println("1부터 100까지의 합 : " + total1);
		
		int result2 = sum(3,20);
		System.out.println("3부터 20까지의 합 : " + result2);
	}
	//void = 반환타입 , f는 함수이름 ,()는 매개변수
	//메서드 정의
	public static int f(int x) { //전달되는 인자값 1을 매개변수 x로 받아서 메서드 실행
		int y = 2 * x + 3;
		return y; //메서드를 호출한 쪽으로 반환값 전달(리턴)
		
	}
	
	// 메서드 정의
	public static int sum(int start, int end) {
		
		// 지역변수 : 메서드 안에서 선언된 변수
		int total = 0;  
		
		for(int k=start; k<=end; k++) {
			total += k;
		}
		return total;
	}
}