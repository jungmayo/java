package sub1;

//extends Object라고 기재 되어 있지 않더라도 상속받고 있음
public class Apple {
	private String country;
	private int price;
	
	public Apple(String country, int price) {
		this.country = country;
		this.price = price;
	}
	public void show() {
		System.out.println("country : " + country);
		System.out.println("price : " + price);
	}
	
	@Override
	public String toString() {
		// 클래스 속성 정보를 출력
		return "country = " + country + ", price = " + price;
	}
}
