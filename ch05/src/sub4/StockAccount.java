package sub4;

public class StockAccount extends Account{

	private String stock;
	private int amount;
	private int price;
	
	public StockAccount(String bank, String acc, String name, int balance,String stock, int amount, int price) {
		super(bank,acc,name,balance);
		this.stock = stock;
		this.amount = amount;
		this.price = price;
	}
	public void buy(int amount ,int price ) {
		this.amount += amount;
		this.price = price;
		this.balance -= price*amount;
	}
	public void sell(int amount,int price) {
		this.amount -= amount;
		this.price = price;
		balance += price*amount;
	}
	public void star() {
		super.show();
		System.out.println("--------------------");
		System.out.println("은행명 : " + this.bank);
		System.out.println("계좌번호 : " + this.acc);
		System.out.println("이름 : " + this.name);
		System.out.println("현재잔액 : " + this.balance);
		System.out.println("종목은 : " + stock);
		System.out.println("주식수량은 : " + amount);
		System.out.println("현재가격은 : " + price);
		System.out.println("--------------------");
	}
		
}
