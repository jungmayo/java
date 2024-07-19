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

public class BufferdStreamTest {

	public static void main(String[] args) {

		String source = "C:\\Users\\lotte4\\Desktop\\workspace.zip";
		String target = "C:\\Users\\lotte4\\Desktop\\workspace2.zip";
		
		try {
			//입력 스트림 생성 및 파일 연결
			FileInputStream fis = new FileInputStream(source);
			FileOutputStream fos = new FileOutputStream(target);
			
			//보조스트림
			BufferedInputStream bis = new BufferedInputStream(fis);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			
			while(true) {
				
				//파일 읽기 <읽어서>
				int data = bis.read(); //catch절만 추가
				
				if(data == -1) {
					//더 이상 읽을 파일 내용이 없을 경우
					break;
				}
				
				//파일 쓰기 <복붙>
				bos.write(data);
			}
			
			
			// 버퍼 비우기
			bos.flush();
			
			
			// 스트림 해제
			bis.close();
			bos.close();
			
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

