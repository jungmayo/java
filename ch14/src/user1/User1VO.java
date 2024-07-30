package user1;

public class User1VO {
	
	private String uid;
	private String name;
	private String hp;
	private String age;
	private String adr;
	
	
	public User1VO() {} //기본 생성자
	
	public User1VO(String uid, String name, String hp, String age, String adr) { //속성 초기화 생성자
		this.uid = uid;
		this.name = name;
		this.hp = hp;
		this.age = age;
		this.adr = adr;
	}
	
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHp() {
		return hp;
	}
	public void setHp(String hp) {
		this.hp = hp;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getAdr() {
		return adr;
	}
	public void setAdr(String adr) {
		this.adr = adr;
	}
	@Override
	public String toString() {
		return "User1VO [uid=" + uid + ", name=" + name + ", hp=" + hp + ", age=" + age + ", adr=" + adr + "]";
	}
	
	
	

}
