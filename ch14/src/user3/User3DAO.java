package user3;

public class User3DAO {
	
	private static User3DAO instance = new User3DAO();
	public static User3DAO getInstance() {
		return instance;
	}
	
	private User3DAO() {}
	
	//DB정보
	private final static String HOST = "jdbc:mysql://localhost:3306/studydb";
	private final static String USER = "root";
	private final static String PASS = "1234";
	
	//CRUE 메서드
	
	public void inserUser(User3VO vo) {
		String sql 
	}
}
