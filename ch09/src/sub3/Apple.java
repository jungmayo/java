package sub3;

import java.io.Serializable;

public class Apple implements Serializable { //직렬화해서 파일로 내보낼 예정

	private static final long serialVersionUID = 1L;
	
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
	public void show() {
		System.out.println("원산지 : " + country);
		System.out.println("가격 : " + price);
	}
	
	
}
