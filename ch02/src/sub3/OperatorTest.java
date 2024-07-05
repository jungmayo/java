package sub3;
/*
 * 날짜 : 2024/06/28
 * 이름 : 정지현
 * 내용 : 연산자 실습하기
 * 
 */


public class OperatorTest {

public static void main(String[] args) {
	//산술연산자
	int num1 = 1;
	int num2 = 2;
	int num3 = 3;
	int num4 = 4;
	
	int result1 = num1 + num2;
	int result2 = num1 - num2;
	int result3 = num2 * num3;
	int result4 = num4 / num2;
	int result5 = num4 % num3; // 나머지 구하는 연산자
	
	System.out.println("result1 :" + result1);
	System.out.println("result2 :" + result2);
	System.out.println("result3 :" + result3);
	System.out.println("result4 :" + result4);
	System.out.println("result5 :" + result5);
	
	//증감연산자
	int num = 0;
	
	num++; // 1증가
	++num; // 1증가
	System.out.println("num : " + num);
	
	num--; // 1감소
	--num; // 1감소
	System.out.println("num : " + num);
	
	//복한연사자
	int n1 = 1, n2 = 2, n3 = 3, n4 = 4;
	
	n1 += 1; //더해서 대입 // n1 = n1 + 1;
	n2 -= 2; //빼서 대입 2-2 = 0 // n2 = n2 - 2;
	n3 *= 3; // 3에 3을 곱해서 = 9 // n3 = n3 * 3;
	n4 /= 4; // 4에 4를 나눠서 = 1 // n4 = n4 / 4;
	// 오른쪽에서 왼쪽으로 연산 진행
	
	System.out.println("n1 : " + n1);
	System.out.println("n2 : " + n2);
	System.out.println("n3 : " + n3);
	System.out.println("n4 : " + n4);
	
	//비교연사자
	int var1 = 1;
	int var2 = 2;
	
	boolean rs1 = var1 > var2; // var1이 var2보다 크다. 거짓
	boolean rs2 = var1 < var2; // var1이 var2보다 작다. 진실
	boolean rs3 = var1 >= var2; // var이 var2보다 크거나 같다. 거짓
	boolean rs4 = var1 <= var2; // var이 var2보다 작거나 같다. 진실
	boolean rs5 = var1 == var2; // var이 var2와 같다. 거짓
	boolean rs6 = var1 != var2; // var1아 var2와 다르다. 진실
	
	System.out.println("rs1 :" + rs1);
	System.out.println("rs2 :" + rs2);
	System.out.println("rs3 :" + rs3);
	System.out.println("rs4 :" + rs4);
	System.out.println("rs5 :" + rs5);
	System.out.println("rs6 :" + rs6);
	
	//논리연산자
	int var3 = 3;
	int var4 = 4;
	
	boolean res1 = (var3 > 3) && (var4 > 3); // var3가 3보다 크고 그리고 var4가 3보다 크다 // 둘다 참이어야 한다 / 하나라도 거짓이면 거짓
	boolean res2 = (var3 > 2) && (var4 > 3); // var3이 2보다 크고 그리고 var4가 3보다 크다 // 둘다 참이기 때문에 참
	boolean res3 = (var3 > 3) || (var4 > 3); // var3dl 3보다 크거나 var4가 3보다 크다 // or 연산자 하나라도 참이면 참
	boolean res4 = (var3 > 3) || (var4 > 5); // var3가 3보다 크고 또는 var4가 5보다 크다 // 둘다 거짓이라 false
	boolean res5 = !(var3 > var4); // not 연산자 / var3가 var4보다 크다는 것은 거짓이다 -> 참 // var3가 var4보다 크지 않다.
	System.out.println("res1 : " + res1);
	System.out.println("res2 : " + res2);
	System.out.println("res3 : " + res3);
	System.out.println("res4 : " + res4);
	System.out.println("res5 : " + res5);
	
}
}
