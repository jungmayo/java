package test09;

import java.util.ArrayList;
import java.util.List;

interface Commentable {
	public void addComment(Comment co);
	public List<Comment> getComments();
}




class Article implements Commentable {
	private int no;
	private String title;
	private String content;
	private User user;
	private List<Comment> comments;
	
	
	public Article(int no, String title, String content, User user) {
		this.no = no;
		this.title = title;
		this.content = content;
		this.user = user;
		comments = new ArrayList<>();
	}
	
	public int getNo() {
		return no;
	}
	public String getTitle() {
		return title;
	}
	public String getCotent() {
		return content;
	}
	public User getUser() {
		return user;
	}

	@Override
	public void addComment(Comment co) {
		comments.add(co);
		
	}
	@Override
	public List<Comment> getComments() {
		return null;
	}
}
class User {
	private String uid;
	private String name;
	
	
	public User(String uid, String name) {
		this.uid = uid;
		this.name = name;
	}
	
	public String getUid() {
		return uid;
	}
	public String getName() {
		return name;
	}

}

class Comment {
	private int no;
	private String content;
	
	public Comment(int no, String content) {
		this.no = no;
		this.content = content;
	}
	
	public int getNo() {
		return no;
	}
	public String getContent() {
		return content;
	}

}
class Board {
	private List<Article> articles;
	private List<User> users;
	
	public Board() {
		articles = new ArrayList<>();
		users = new ArrayList<User>();
	}
	
	public void addArticle(Article article) {
		articles.add(article);
	}
	public void addUser(User user) {}
	
	public List<Article> getArticles(){
		return null;
	}
	public List<User> getUsers(){
		return null;
	}
		
	}


public class Main {

	public static void main(String[] args) {
		// 게시판 생성
		Board board = new Board();
		// 사용자 생성
		User user1 = new User("A101", "김유신");
		User user2 = new User("A102", "김춘추");
		User user3 = new User("A103", "장보고");
		// 게시물 생성
		Article article1 = new Article(1, "안녕하세요.", "내용1", user1);
		Article article2 = new Article(2, "반갑습니다.", "내용2", user2);
		Article article3 = new Article(3, "감사합니다.", "내용3", user3);
		// 댓글 생성
		Comment comment1 = new Comment(101, "1번글의 101번 댓글 입니다.");
		Comment comment2 = new Comment(102, "2번글의 102번 댓글 입니다.");
		Comment comment3 = new Comment(103, "1번글의 103번 댓글 입니다.");
		Comment comment4 = new Comment(104, "3번글의 104번 댓글 입니다.");
		
		// 게시물에 댓글 추가
		article1.addComment(comment1);
		article1.addComment(comment3);
		article2.addComment(comment2);
		article3.addComment(comment4);
		
		// 게시판에 게시물 추가
		board.addArticle(article1);
		board.addArticle(article2);
		board.addArticle(article3);
		
		// 게시판의 모든 게시물 출력
		List<Article> articles = board.getArticles();

		}

}


