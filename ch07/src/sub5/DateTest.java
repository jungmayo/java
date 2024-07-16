package sub5;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/*
 * 날짜 : 2024.07.16
 * 이름 : 정지현
 * 내용 : 자바 Date 클래스 실습하기
 * 
 */
public class DateTest {
	public static void main(String[] args) {
		
		// Date 클래스
		Date date = new Date();
		System.out.println("date : " + date); //date뒤에 tostring 생략된것
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); // 날짜와 시간의 포맷을 지정하고 날짜 및 시간을 문자열로 변환 
		String result = sdf.format(date);
		System.out.println("date : "  + result);
		
		// Calendar 클래스 (싱글톤)
		// Calendar car = new Calendar(); 싱글톤이라 생성 X
		
		Calendar cal =  Calendar.getInstance();
		
		int yy = cal.get(Calendar.YEAR);
		int mm = cal.get(Calendar.MONTH) + 1;
		int dd = cal.get(Calendar.DATE);
		int hour = cal.get(Calendar.HOUR);
		int min = cal.get(Calendar.MINUTE);
		int sec = cal.get(Calendar.SECOND);
		
		System.out.printf("%d-%02d-%02d %02d:%02d:%02d", yy, mm, dd, hour, min, sec); //%d사이에 02넣으면 2자리로 출력

	}
}
