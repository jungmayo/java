package test04;

/**
* 날짜 : 2024.08.01
* 이름 : 정지현
* 내용 : 자바 총정리 문제
*/

class Book {
	private String title;
	private String author;
	private String isbn;
	private boolean isBorrowd;
	public Book(String title, String author, String isbn) {

		this.title = title;
		this.author = author;
		this.isbn = isbn;
		this.isBorrowd = false; // 대출되지않은
	}
	public void borrowBook() {
		if(!isBorrowd) {
			this.isBorrowd = true;
			System.out.println("도서 대출 : " + this.title);
		}else
			System.out.println(this.title + " 이미 대출 됨");
	}
	public void returnBook() {
		if(isBorrowd) {
			this.isBorrowd = false;
			System.out.println("도서 반납 " + this.title);
		}
	}

    
    
	public void getBookInfo() {
		System.out.println("도서 제목	: " + title);
		System.out.println("도서 저자	: " + author);
		System.out.println("ISBN	: " + isbn);
		String borrow = isBorrowd ? "불가능" : "가능";
		System.out.println("대출 여부	: " + borrow);
	}
	public String getTitle() {
		return title;
	}
	
	
	
	
	
	public boolean isBorrowed() {
		// TODO Auto-generated method stub
		return false;
	}
}





class Member {
	private String name;
	private String memberId;
	private Book borrowedBook;
	public Member(String name, String memberId) {
		
		this.name = name;
		this.memberId = memberId;
		this.borrowedBook = null;
	}
	
	public void borrowBook(Book book) {
	
			if(!book.isBorrowed())borrowedBook = book; 
				book.borrowBook();
			
	}
			
	public void returnBook(Book book) {
		if(this.borrowedBook != null) {
		book.returnBook();
		this.borrowedBook = null;
		}else {
			System.out.println("대출한 도서가 아님");
		}
	}
	
	public void getMemberInfo() {
		System.out.println("회원 이름 : " + name);
		System.out.println("회원 ID : " + memberId);
		if(borrowedBook ==null) {
			System.out.println("대출한 도서 : 없음");
		}else {
		System.out.println("대출한 도서 : " + borrowedBook.getTitle());
		}
	}

	
	
}

public class Main {
	public static void main(String[] args) {
	
		//도서생성
		Book book = new Book("이것이 자바다","신용권","101-1234-1001");
		
		//회원 생성
		Member member = new Member("홍길동","A001");
		
		//도서 정보 출력
		book.getBookInfo();
		System.out.println("-----------------------");
		
		// 도서 대출
		member.borrowBook(book);
		System.out.println("-----------------------");
		
		//도서 정보 출력
		book.getBookInfo();
		System.out.println("-----------------------");
		
		// 회원 정보 출력
		member.getMemberInfo();
		System.out.println("--------------------");
		
		// 도서 대출
		member.borrowBook(book);
		System.out.println("--------------------");
		
		// 도서 반납
		member.returnBook(book);
		System.out.println("--------------------");
		
		// 회원 정보 출력
		member.getMemberInfo();
		System.out.println("--------------------");
		
	}
		
		
}

