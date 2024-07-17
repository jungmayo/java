package sub1;

public class Apple {
	private String country;
	private int price;
	
	public Apple(String country, int price) {
		this.country = country;
		this.price = price;
	}

	@Override
	public String toString() { //객체정보 문자열로 출력하는 메소드
		return "Apple [country=" + country + ", price=" + price + "]";
	}
	
	
}
