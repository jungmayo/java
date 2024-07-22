package sub1;

/*
 * 날짜 : 2024.07.02
 * 이름 : 정지현
 * 내용 : java 배열 실습하기
 */
public class ArrayTest {

	public static void main(String[] args) {
		// 배열 (타입[] 변수 = 데이터(각각의 배열 원소) 
		int[] arr1 = {1, 2, 3, 4, 5}; //int 배열
		char[] arr2 = {'A','B','C'};
		String[] arr3 = {"서울","대전","대구","부산","광주"};
		
		// 배열 원소 : 배열 인덱스로 배열 값 참조
		System.out.println("arr1 1번째 원소 :" + arr1[0]);
		System.out.println("arr1 2번째 원소 :" + arr1[1]);
		System.out.println("arr1 3번째 원소 :" + arr1[2]);
		
		System.out.println("arr2 1번째 원소 :" + arr2[0]);
		System.out.println("arr2 3번째 원소 :" + arr2[2]);
		
		System.out.println("arr3 1번째 원소 :" + arr3[0]);
		System.out.println("arr3 4번째 원소 :" + arr3[3]);
		System.out.println("arr3 5번째 원소 :" + arr3[4]);
		
		
		
		// 배열 길이 : 배열 원소 갯수
		System.out.println("arr1 배열 길이 : " + arr1.length);
		System.out.println("arr1 배열 길이 : " + arr2.length);
		System.out.println("arr1 배열 길이 : " + arr3.length);
		
		// 배열 반복문
		for(int i=0; i<arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println(); // 개행
		for(char ch : arr2) { // 배열의 길이만큼 반복 , 3번 반복한다는 뜻, 원소를 ch담아서 출력 , 1번 반복할때는 A 2번 반복할때는 B
			System.out.print(ch + " ");
		}
		
		System.out.println();
		for(String str : arr3) {
			System.out.print(str + " ");
		}
		// 1차원 배열 - 선형
		System.out.println();
		int[] scores = {80, 60, 78, 62, 92}; //배열 이름은 복수형으로 붙임
		int total = 0;
		
		for(int score : scores) {
			total += score;
			
		}
			System.out.println("scores 배열의 총합 : " + total);
		// 2차원 배열 - 행열
		int[][] arr2d = {{1, 2, 3, 4},    // 00 01 02 03
						 {5, 6, 7, 8},		//10 11 12 13
						 {9, 10, 11, 12}}; // 20 21 22 23	
		for(int a=0 ; a<3 ; a++) {
			
			for(int b=0 ; b<4 ; b++) {
				
				System.out.println("arr2d["+ a +"]["+ b +"] : " + arr2d[a][b]);
			}
		}
		// 3차원 배열
		int[][][] arr3d =  {{{ 1, 2, 3},
							 { 4, 5, 6},
							 { 7, 8, 9}},
							{{10, 11, 12},
							 {13, 14, 15},
							 {16, 17, 18}},
							{{19, 20, 21},
							 {22, 23, 24},
							 {25, 26, 27}}};
		for(int a=0; a<3; a++) {
			for(int b=0; b<3; b++) {
				for(int c=0; c<3; c++) {
					System.out.printf("arr3d[%d][%d][%d] : %d\n" , a, b, c, arr3d[a][b][c]);
				}
			}
		}
	}
}
