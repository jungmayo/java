package sec08;

public class Gas {
	
	int gas;
	
	void setgas(int gas) {
		this.gas = gas;
	}
	boolean isleftgas() {
		if(gas == 0) {
			System.out.println("가스가 없습니다");
			return false;
		}else 
			System.out.println("가스가 있습니다");
			return true;
		}
	void run() {
		while(true) {
			if(gas > 0) {
				System.out.println("달립니다.(gas잔량 :" + gas +")");
				gas -=1 ; 
			}else {
				System.out.println("멈춥니다.(gas잔량 :" + gas + ")");
			break;
			}
		}
	}		
		
	public static void main(String[] args) {
		Gas ga = new Gas();
		
		ga.setgas(3);
		
		if(ga.isleftgas()) {
			System.out.println("출발합니다");
			
			ga.run();
			
			System.out.println("gas를 주입하세요");
		}
	}
}

