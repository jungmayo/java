package test03;

/**
* 날짜 : 2024.08.01
* 이름 : 정지현
* 내용 : 자바 총정리 문제
*/


class MovieTicket {
	private String movieTitle;
	private String screenTime;
	private String seatNumber;
	private boolean isBooked;
	
	
	public MovieTicket(String movieTitle, String screenTime, String seatNumber) {


		this.movieTitle = movieTitle;
		this.screenTime = screenTime;
		this.seatNumber = seatNumber;
		this.isBooked = false;
	}
	
	public void bookTicket() {
		if(this.isBooked == false) {
			this.isBooked = true;
			System.out.println(movieTitle +","+ screenTime +","+ seatNumber +"예약완료");
		}else {
		System.out.println("이미 예매됨");
		}	
	}
	
	public void cancelBook() {
		if(this.isBooked == true) {
			this.isBooked = false;
			System.out.println(movieTitle +","+ screenTime +","+ seatNumber +"취소완료");
		}else {
			System.out.println("아직 예매 안됨");
			}	
		
	}
	public void printTicketInfo() {
		System.out.println("영화제목 : " + movieTitle);
		System.out.println("상영시간 : " + screenTime);
		System.out.println("좌석번호 : " + seatNumber);
		String bookedstatus = isBooked ? "Yes" : "No";
		System.out.println("예매여부 : " + bookedstatus);
		
	}
	
	
}
public class Main {

	public static void main(String[] args) {

		MovieTicket ticket = new MovieTicket("타이타닉","19:00","A1");
		
		//티켓 정보 출력
		ticket.printTicketInfo();
		System.out.println("--------------------------");
		
		//예약 테스트
		ticket.bookTicket();
		System.out.println("--------------------------");
		
		//티켓 정보 출력
		ticket.printTicketInfo();
		System.out.println("--------------------------");
		
		//이미 예약된 경우
		ticket.bookTicket();
		System.out.println("--------------------------");
		
		//취소 테스트
		ticket.cancelBook();
		System.out.println("--------------------------");
		
		//티켓 정보 출력
		ticket.printTicketInfo();
		System.out.println("--------------------------");
		
		//이미 취소된 경우
		ticket.cancelBook();
		System.out.println("--------------------------");

	}

}
