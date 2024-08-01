package test02;

class Product {
	private String productId;
	private String productName;
	private int price;
	private int quantity;
	
	
	public Product(String productId, String productName, int price, int quantity) {
		
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
	}
	
	public void updatePrice(int price) {
		this.price = price;
		System.out.println("키보드 가격 수정 됨");
	}
	public void addStock(int quantity) {
		this.quantity += quantity;
		System.out.println("키보드 "+this.quantity+"개 재고 추가 됨");
	}
	public void printProductInfo() {
		System.out.println("상품 ID : " + productId );
		System.out.println("상품 이름 : " + productName );
		System.out.println("상품 가격 : " + price );
		System.out.println("상품 재고 : " + quantity );
	}
	
	
}

public class Main {

	public static void main(String[] args) {
		// 상품 객체 생성
		Product product = new Product("P101","키보드",35000,10);
		
		//상품 정보 출력
		product.printProductInfo();
		System.out.println("-----------------------");
		
		//가격 수정 및 재고 관리 테스트
		product.updatePrice(30000);
		System.out.println("-----------------------");
		
		//상품 정보 출력
		product.printProductInfo();
		System.out.println("-----------------------");
		
		//재고 추가
		product.addStock(5);
		System.out.println("-----------------------");
		
		//상품 정보 출력
		product.printProductInfo();
		System.out.println("-----------------------");
	}

}
