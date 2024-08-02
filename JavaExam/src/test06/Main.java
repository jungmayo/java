package test06;

import java.util.ArrayList;
import java.util.List;

/* 날짜 : 2024.08.02
 * 이름 : 정지현
 * 내용 : 자바 총정리
 */

class Patient {
	private String name;
	private String id;
	private int age;
	private String diagnosis;
	
	
	public Patient(String name, String id, int age, String diagnosis) {
		
		this.name = name;
		this.id = id;
		this.age = age;
		this.diagnosis = diagnosis;
	}
	
	
	@Override
	public String toString() {
		return "- Patient [name=" + name + ", id=" + id + ", age=" + age + ", diagnosis=" + diagnosis + "]\n";
	}
	
}
class Doctor {
	private String name;
	private String id;
	private String special;
	private List<Patient> patients;
	
	public Doctor(String name, String id, String special) {
		this.name = name;
		this.id = id;
		this.special = special;
		patients = new ArrayList<>();
	}
	
	public void addPatient(Patient pat) {
		patients.add(pat);
		System.out.println(pat);
		
	}

	@Override
	public String toString() {
		String s ="";
		for (Patient paa : patients)
			s += paa;
		
		
		return "의사 : " + name + "(ID : " + id + " 전문분야 : " + special +")\n"+
				"담당환자목록:\n" + s;
	}
	
	
}


public class Main {

	public static void main(String[] args) {
		// 의사 생성
		Doctor doctor1 = new Doctor("김의사", "D001", "내과");
		Doctor doctor2 = new Doctor("박의사", "D002", "외과");
		
		// 환자 생성
		Patient patient1 = new Patient("이환자", "P001", 30, "감기");
		Patient patient2 = new Patient("박환자", "P002", 45, "고혈압");
		Patient patient3 = new Patient("최환자", "P003", 25, "알레르기");
		Patient patient4 = new Patient("김환자", "P004", 36, "비염");
		Patient patient5 = new Patient("정환자", "P005", 52, "허리디스크");
		
		// 의사에게 할당
		doctor1.addPatient(patient1);
		doctor1.addPatient(patient2);
		doctor1.addPatient(patient3);
		doctor2.addPatient(patient4);
		doctor2.addPatient(patient5);
		
		// 의사 정보 및 담당 환자 정보 출력
		System.out.println(doctor1);
		System.out.println(doctor2);
		}

}

