package test08;

/* 날짜 : 2024.08.02
 * 이름 : 정지현
 * 내용 : 자바 총정리
 */

class Person {
	private String name;
	private String birth;
	
	
	public Person(String name, String birth) {
		this.name = name;
		this.birth = birth;
	}
	public void printPersonInfo() {
		System.out.println("이름 : " + name + "\n" + "생년월일 :" + birth);
	}
	
	
}
class Employee extends Person{
	
	private String employeeID;
	private String dept;
	private int salary;
	
	
	public Employee(String name, String birth, String employeeID, String dept, int salary) {
		super(name, birth);
		this.employeeID = employeeID;
		this.dept = dept;
		this.salary = salary;
	}
	public void raiseSalary(int raise) {
		System.out.println("급여 인상");
		this.salary += raise;
	}
	public void changeDept(String dept) {
		System.out.println("부서 변경");
		this.dept = dept;
	}
	
	public void printEmployeeInfo() {
		super.printPersonInfo();
		System.out.println("직원 아이디 : " + employeeID + " \n" + "부서 : " + dept + "\n" + "급여 : " + salary);
	}

	
}
class Developer extends Employee {
	private String field;

	public Developer(String name, String birth, String employeeID, String dept, int salary, String field) {
		super(name, birth, employeeID, dept, salary);
		this.field = field;
	}
	
	public void changeField(String field) {
		System.out.println("개발 분야 변경");
		this.field = field;
	}
	public void printDeveloperInfo() {
		super.printEmployeeInfo();
		System.out.println("개발분야 : " + field);
	}
}

public class Main {

	public static void main(String[] args) {
		Person person = new Person("김유신", "1990-05-07");
		person.printPersonInfo();
		System.out.println("-------------------");
		
		
		Employee emp = new Employee("김춘추", "1992-07-14", "E001", "영업부", 200);
		emp.printEmployeeInfo();
		System.out.println("-------------------");
		
		
		Developer dev = new Developer("이순신", "1995-10-21", "D001", "개발부", 300, "프론트");
		dev.printDeveloperInfo();
		System.out.println("-------------------");
		
		
		// 부서 변경 테스트
		emp.changeDept("인사부");
		emp.printEmployeeInfo();
		System.out.println("-------------------");
		
		
		// 급여 인상 테스트
		dev.changeField("백엔드");
		dev.raiseSalary(50);
		dev.printDeveloperInfo();
		System.out.println("-------------------");
		}
}


