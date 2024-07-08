package sec07;

public class Korean {
	//필드 선언
	String nation = "대한민국";
	String name;
	String ssn;
	
	//생성자 선언
	public Korean(String name,String ssn) {
		this.name = name;
		this.ssn = ssn;
	}
public static void main(String[]args) {
	
	//korean 객체 생성
	Korean k1 = new Korean("정지현","010101-0101010");
	
	System.out.println("k1.nation : " + k1.nation);
	System.out.println("k1.name : " + k1.name);
	System.out.println("k1.ssn : " + k1.ssn);
}	
}
