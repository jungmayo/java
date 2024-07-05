package sec01;

/* 
 * 160페이지
 * 7번째에 해당하는 문자를 읽어서 여자인지 남자인지를 출력한다
 */
public class CharAtExample {

	public static void main(String[] args) {
		String sn = "9601031230123";
		char sex = sn.charAt(6);
		switch (sex) {
			case '1' :
			case '3' :
				System.out.println("남자 입니다.");
				break;
			case '2' :
			case '4' :
				System.out.println("여자 입니다.");
				break;
		}

	}

}
