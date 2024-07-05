package sec03;
//125페이지
public class SwitchValueExample {

	public static void main(String[] args) {
		String grade = "B"; //등급에 따라 점수 부여하기
		
		int score1 = 0;
		switch(grade) {
			case "A":
				score1 = 100;
				break;
			case "B":
				int result = 100 - 20;
				score1 = result;
				break;
			default:
				score1 = 60;
		}
		System.out.println("score1 :" + score1);
//126페이지
		int score2 = switch(grade) {
			case "A" -> 100;
			case "B" -> {
				int result = 100 - 20;
				yield result;
			}
			default -> 60;
	    };
	    System.out.println("score2 :" + score2);
	}
	
}
