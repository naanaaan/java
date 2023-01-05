package practice.model2.domain;

public class User {
	private String userName;
	
//	public User(String userName) {
//		this.userName = userName;
//	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserName() {
		return userName;
	}
	
	@Override
	public String toString() {
		return userName;
	}
	

	
	
}
