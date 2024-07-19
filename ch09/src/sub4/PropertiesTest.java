package sub4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/*
 * 날짜 : 2024.07.18
 * 이름 : 정지현
 * 내용 : 프로퍼티 실습하기
 * 
 * 프로퍼티(properites)
 *  -일종의 컬렉션, 문자열 데이터만 취급하는 key-value 자료구조 클래스
 *  -직렬화, 역직렬화를 이용해 데이터를 입출력하는 자료구조 클래스
 *  -프로그램 환경설정값을 저장할 때 많이 사용
 *  -확장자는 properties로 정해져 있음 (특수파일)
 *  
 */
public class PropertiesTest {

	public static void main(String[] args) {
		// 프로퍼티  생성
		
		Properties prop = new Properties();
		prop.setProperty("A", "Apple"); //모두 문자열
		prop.setProperty("B", "Banana"); //모두 문자열
		prop.setProperty("C", "Cherry"); //모두 문자열

		System.out.println(prop);
		
		// 프로퍼티 직렬화
		String path = "C:\\Users\\lotte4\\Desktop\\fruit.properties";
		
		try {
			FileOutputStream fos = new FileOutputStream(path);
			
			//직렬화
			prop.store(fos, null);
			// 스트림 해제
			fos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		////////////////////////////////////////////////////////////
		//프로퍼티 역직렬화(파일읽기)
		String path2 = "C:\\Users\\lotte4\\Desktop\\city.properties";
		
		Properties cityprop = new Properties(); //시티프로프에 파일 읽을거
		
		try {
			FileInputStream fis = new FileInputStream(path2);
			
			//역직렬화
			cityprop.load(fis);
			// 스트림 해제
			fis.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(cityprop);
		System.out.println("한국 : " + cityprop.getProperty("kor"));
		System.out.println("미국 : " + cityprop.getProperty("usa"));
		System.out.println("일본 : " + cityprop.getProperty("jpn"));
	}

}
