package test01;

/**
* 날짜 : 2024.08.01
* 이름 : 정지현
* 내용 : 자바 총정리 문제
*/

class StudentScore {
	private String studentName;
	private String studentId;
	private String subject;
	private double score;
	
	
	public StudentScore(String studentName, String studentId, String subject, double score) {
		
		this.studentName = studentName;
		this.studentId = studentId;
		this.subject = subject;
		this.score = score;
	}
	public void updateScore(double score) {
		
		if(score <= 100) {
			this.score = score;
			System.out.println("점수 수정 완료");
			
		}else if (score > 100) {
			System.out.println("잘못된 점수 입력");
		}
		
	}
	public double getScore() {
		return score;
	}
	public void printStudentInfo() {
		System.out.println("학생의 이름 :" + studentName);
		System.out.println("학생의 ID :" + studentId);
		System.out.println("학생의 과목 :" + subject);
		System.out.println("학생의 점수 :" + score);
	}
	
	
}

public class Main {

	public static void main(String[] args) {
		// 학생 객체 생성
		StudentScore student = new StudentScore("홍길동","S001","자바",90.0);
		
		//학생 정보 출력
		student.printStudentInfo();
		System.out.println("-----------------------");
		
		//성적 수정 및 조회 테스트
		student.updateScore(98.0);
		System.out.println("-----------------------");
		
		//유효하지 않은 성적 입력
		student.updateScore(102.0);
		System.out.println("-----------------------");
		
		// 학생 정보 출력
		student.printStudentInfo();
		System.out.println("--------------------");
	}

}
