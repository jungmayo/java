package sec08;



public class CarReturn {

	// 필드 선언
	int gas;
	// 리턴값이 없는 메소드로 매개값을 받아서 gas 필드값을 변경
	void setGas(int gas) {
		this.gas = gas;
	}
	boolean isleftGas() {
		if (gas == 0) {
			System.out.println("gas가 없습니다.");
			return false;
		}
		System.out.println("gas가 있습니다.");
		return true;
	}
	void run() {
		while (true) {
			if ( gas > 0 ) {
				System.out.println("달립니다.(gas잔량 :" + gas +")");
				gas -=1;
			}else {
				System.out.println("멈춥니다.(gas잔량 :" + gas + ")");
				return;
			}
		}
	}


public static void main(String[] args) {
	CarReturn myCar = new CarReturn();
	
	myCar.setGas(5);
	
	if(myCar.isleftGas()) {
		System.out.println("출발합니다.");
		
		myCar.run();
	}
	System.out.println("gas를 주입하세요.");
 }
}