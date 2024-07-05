package sec02;
//115페이지



public class IfElseExample {

	public static void main(String[] args) {
		int score = 85;
		
		if(score >= 90) {
			System.out.println("점수가 90보다 큽니다");
			System.out.println("등급은 A입니다.");
			
		}else {
			System.out.println("점수가 90보다 작습니다");
			System.out.println("등급은 B입니다.");
		}

	
// 116페이지
		int scores = 75;
		
		if(scores >= 90) {
			System.out.println("점수가 100~90입니다.");
			System.out.println("등급은 A입니다.");
		}else if(scores >= 80) {
			System.out.println("점수가 80~89입니다.");
			System.out.println("등급은 B입니다.");
		}else if(scores >= 70) {
			System.out.println("점수가 70~79입니다.");
			System.out.println("등급은 C입니다.");
		
		}else {
			System.out.println("점수가 70미만입니다");
			System.out.println("등급은 D입니다.");
		}
			
			
			
//118 페이지 / 랜덤주사위 뽑기
		int num = (int)Math.random()*6 + 6;
		
		if(num == 1) {
			System.out.println("1번이 나왔습니다.");
		}else if(num ==2) {
			System.out.println("2번이 나왔습니다");
		}else if(num == 3) {
			System.out.println("3번이 나왔습니다.");
		}else if(num == 4) {
			System.out.println("4번이 나왔습니다.");
		}else if(num == 5) {
			System.out.println("5번이 나왔습니다.");
		}else
			System.out.println("6번이 나왔습니다.");

//120 페이지 / if 중첩문
		int scor = (int)(Math.random()*20) + 81;
		System.out.println("점수 : " + scor);
		String grade;	
		if(scor>=90) {
			if(scor>=95) {
				grade = "A+";
					
			}else {
				grade = "A";
			}
		}else {
			if(scor>=85) {
				grade = "B+";
				
			}else {
				grade = "B";
					
			}
		}
			System.out.println("학점 : " + grade);
	}
}

