package test2;

/* 날짜 : 2024.07.05
 * 이름 : 정지현
 * 내용 : 자바 배열 문자 출력 연습문제 length - 10 / 인덱스 9
 */
public class Test09 {

	public static void main(String[] args) {
		System.out.println("1과 5의 최대공약수 : " +gcd(5, 1));
		System.out.println("3과 6의 최대공약수 : " +gcd(6, 3));
		System.out.println("12과 18의 최대공약수 : " +gcd(18, 12));
		System.out.println("60과 24의 최대공약수 : " +gcd(60, 24));
		System.out.println("192과 162의 최대공약수 : " +gcd(192, 162));
		}
	public static int gcd(int a, int b) {
		if(a%b == 0) {
			return b;
		}else {
			return gcd(b,a%b);
		}
	}
}

