package sub1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * 날짜 : 2024.07.18
 * 이름 : 정지현
 * 내용 : 파일 입출력 스트림 실습하기
 */
public class FileIOTest2 {

	public static void main(String[] args) {

		String source = "C:\\Users\\lotte4\\Desktop\\sample1.txt";
		
		try {
			//입력 스트림 생성 및 파일 연결
			FileInputStream fis = new FileInputStream(source);
			
			while(true) {
				
				//파일 읽기
				int data = fis.read(); //catch절만 추가
				
				if(data == -1) {
					//더 이상 읽을 파일 내용이 없을 경우
					break;
				}
				
				char ch = (char) data; //int char로 변환가능
				System.out.println(ch);
				
				//파일 읽은 내용 그대로 출력
				System.out.println(data);
			}
			
			// 스트림 해제
			fis.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace(); //위 소스 경로에 파일 없을 경우 에러발생 가능성 안내
		} catch (IOException e) {
			// int data = fis.read(); //catch절만 추가
			e.printStackTrace();
		}
		System.out.println("프로그램 종료");

	}

}
