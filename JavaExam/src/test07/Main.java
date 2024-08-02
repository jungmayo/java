package test07;

/* 날짜 : 2024.08.02
 * 이름 : 정지현
 * 내용 : 자바 총정리
 */

class Product{
	protected String prodId;
	protected String prodName;
	protected int price;
	protected int quantity;
	
	public Product(String prodId, String prodName, int price, int quantity) {
		
		this.prodId = prodId;
		this.prodName = prodName;
		this.price = price;
		this.quantity = quantity;
	}
	public void printProductInfo() { //상품 정보 출력
		System.out.println("상품코드 : " + prodId + "\n" + "상품이름 " + prodName  + "\n" + "상품가격 " + price + "\n" + "재고수량 : " + quantity );
	}
	
	
}
class Computer extends Product {
	private String manufactor;

	public Computer(String prodId, String prodName, int price, int quantity, String manufactor) {
		super(prodId, prodName, price, quantity);
		this.manufactor = manufactor;
	}
	@Override
	public void printProductInfo() {
		super.printProductInfo();
		System.out.println("제조사 : " + manufactor);
	}
	
}
class Clothes extends Product {
	private String size;

	public Clothes(String prodId, String prodName, int price, int quantity, String size) {
		super(prodId, prodName, price, quantity);
		this.size = size;
	}

	@Override
	public void printProductInfo() {
		super.printProductInfo();
		System.out.println("사이즈 : " + size);
	}
	
	
}

public class Main {

	public static void main(String[] args) {
		// 컴퓨터 객체 생성
		Computer computer = new Computer("E001", "데스크탑", 150, 10, "삼성전자");
		computer.printProductInfo();
		System.out.println("----------------");
		// 의류 객체 생성
		Clothes tshirt = new Clothes("C001", "T-Shirt", 20, 50, "L");
		tshirt.printProductInfo();
		System.out.println("----------------");
		}

	}

