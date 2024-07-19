package sub2;
/*
 * 날짜 : 2024.07.18
 * 이름 : 정지현
 * 내용 : 버퍼 보조 스트림 실습하기
 */

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteArrayBufferTest1 {

	public static void main(String[] args) {
		
		String source = "C:\\Users\\lotte4\\Desktop\\workspace.zip";
		String target = "C:\\Users\\lotte4\\Desktop\\workspace3.zip";
		
		// 버퍼로 이용한 byte 배열 (bufferinput보다 자주쓰임)
		byte[] buffer = new byte[1024]; //1KB
		
		try {
			//입력 스트림 생성 및 파일 연결
			FileInputStream fis = new FileInputStream(source);
			FileOutputStream fos = new FileOutputStream(target);

			
			while(true) {
				
				//파일 읽기 <읽어서>
				int data = fis.read(buffer); //1byte가 아니라 1kb 단위로 읽음
				
				if(data == -1) {
					//더 이상 읽을 파일 내용이 없을 경우
					break;
				}
				
				//파일 쓰기 <복붙>
				fos.write(buffer, 0, data);
			}
			
			
		
			
			fis.close();
			fos.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace(); //위 소스 경로에 파일 없을 경우 에러발생 가능성 안내
		} catch (IOException e) {
			// int data = fis.read(); //catch절만 추가
			e.printStackTrace();
		}
		System.out.println("프로그램 종료");

	}

}

