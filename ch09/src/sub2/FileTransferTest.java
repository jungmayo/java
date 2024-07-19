package sub2;
/*
 * 날짜 : 2024.07.18
 * 이름 : 정지현
 * 내용 : 파일 메서드를 이용한 파일복사 실습하기
 */


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileTransferTest {

	public static void main(String[] args) {

		String source = "C:\\Users\\lotte4\\Desktop\\workspace.zip";
		String target = "C:\\Users\\lotte4\\Desktop\\workspace3.zip";
		
		
		try {
			//입력 스트림 생성 및 파일 연결
			FileInputStream fis = new FileInputStream(source);
			FileOutputStream fos = new FileOutputStream(target);
			
			//파일 복사 입력스트림에 입력된 fis파일을 출력스트림에 입력된 fos로 복사
			fis.transferTo(fos); //실제로는 이걸로 사용

			//스트림 종료
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

