package exercise1;

public class Product {

	int pirce; // 제품가격
	int bonusPoint; // 제품 구매시, 제공되는 보너스 점수
	
	
	public Product(int price) {
		this.pirce = price;
		bonusPoint = (int)(price / 10.0); // 보너스 점수는 제품 가격의 10%
	}
}
