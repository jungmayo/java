package test05;

/* 날짜 : 2024.08.02
 * 이름 : 정지현
 * 내용 : 자바 총정리
 */

class Subject {
	private String subName;
	private Student[] students;
	private int studentCount;
	
	
	public Subject(String subName) {
	
		this.subName = subName;
		students = new Student[10];
		studentCount = 0;
	}
	
	public void addStudent(Student student) { //학생을 과목에 추가
		students[studentCount++] = student;
	}
	public void printSubjectInfo() { //과목이름,수강하는 학생 이름 출력
		System.out.println("과목이름 : " + subName);
		System.out.print("수강생 : ");
		for(Student std : students) {
			if(std!=null)
			System.out.print(std.getName()+", ");
		}
		System.out.println();
		
	}
	public String getName() {
		return subName;
	}
	
}

class Student {
	private String name;
	private String studentId;
	private Subject[] subjects; //학생이 수강하는 과목배열
	private int[] scores; //학생의 각 과목 성적 배열
	private int subjectCount; //현재 수강중인 과목수
	
	
	public Student(String name, String studentId) {
		
		this.name = name;
		this.studentId = studentId;
		subjects = new Subject[10];
		scores = new int[10];
		subjectCount = 0;
	}
	
	public void enrollSubject(Subject subject) { // 과목수강신청
		subjects[subjectCount] = subject;
		subjectCount++;
		subject.addStudent(this);
		System.out.println(this.name + " - " + subject.getName() + " 과목 신청완료");
	}
	public void setScore(Subject subject , int grade) { //특정과목의 성적 입력
		for(int a = 0; a<subjectCount; a++) {
			if(subjects[a] == subject) {
				scores[a] = grade;
				System.out.println(this.name + " - " + subject.getName() + "점수 입력 완료");
			}
			
		}
	}
	public void printStudentInfo() { //학생이름,id,수강과목 및 성적 출력
		System.out.println("학생이름 :" + this.name);
		System.out.println("아이디 : " + this.studentId);
		System.out.println("성적");
		for(int i =0; i<subjectCount; i++) {
			System.out.println(subjects[i].getName() + " : "+ scores[i]);
		}
	}
	public String getName() {
		return name;
	}
	
	
}
public class Main {

	public static void main(String[] args) {
		// 과목 객체들 생성
		Subject java = new Subject("자바");
		Subject database = new Subject("데이터베이스");
		
		// 학생 객체들 생성
		Student student1 = new Student("김유신","S001");
		Student student2 = new Student("김춘추","S002");
		
		//학생 과목 수강 신청
		student1.enrollSubject(java);
		student1.enrollSubject(database);
		System.out.println("----------------------");
		
		// 학생 과목 수강 신청
		student2.enrollSubject(java);
		student2.enrollSubject(database);
		System.out.println("-------------------------");
		
		// 성적 입력
		student1.setScore(java, 96);
		student1.setScore(database, 90);
		System.out.println("-------------------------");
		
		// 성적 입력
		student2.setScore(java, 86);
		student2.setScore(database, 76);
		System.out.println("-------------------------");
		
		// Subject 정보 출력
		java.printSubjectInfo();
		System.out.println("-------------------------");
		
		// Subject 정보 출력
		database.printSubjectInfo();
		System.out.println("-------------------------");
		
		// 학생 정보 출력
		student1.printStudentInfo();
		System.out.println("-------------------------");
		
		// 학생 정보 출력
		student2.printStudentInfo();
		System.out.println("-------------------------");
		}

	}

