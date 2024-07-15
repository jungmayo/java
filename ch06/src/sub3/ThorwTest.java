package sub3;
/*
 * 날짜 : 2024.07.15
 * 이름 : 정지현
 * 내용 : 예외 발생 시키기 실습하기
 */

class Score{
	
	public void Check(int score) throws Exception { //throws 메소드 선언부에 작성
		if(score < 0) {
			//예외 발생 시키기
			throw new Exception("점수는 음수가 될 수 없습니다"); //throw 인위적으로 예외 발생시킴
		
		}else if (score > 100) {
			//예외 발생 시키기
			throw new Exception("점수는 100점을 초과할 수 없습니다.");
		
		}else
			System.out.println("점수가 정상입니다.");
	}
}


public class ThorwTest {
	public static void main(String[] args) { //호출한 곳에서 예외 처리
		
		Score score = new Score();
		
		try {
			score.Check(-10);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			score.Check(80);
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			score.Check(120);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println("프로그램 종료");
	}
		
}

