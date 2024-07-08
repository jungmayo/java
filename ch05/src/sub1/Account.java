package sub1;

public class Account {
	// 속성(멤버 변수)
	String bank;
	String acc;
	String name;
	int balance;
	
	//기능(멤버 메서드 static 안붙음)
	public void deposit(int money) {
		this.balance += money; // 객체활용 (4만원)을 발란스 만원에 더함
	}
	public void withdraw(int money) {
		this.balance -= money;
	}
	public void	show() {
		System.out.println("--------------------");
		System.out.println("은행명 : " + this.bank);
		System.out.println("계좌번호 : " + this.acc);
		System.out.println("이름 : " + this.name);
		System.out.println("현재잔액 : " + this.balance);
		System.out.println("--------------------");
	}
}

