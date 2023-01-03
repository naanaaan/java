package ch06.home.ex03.case03;

public class User extends Object {
	private final String userName;
	private final int userAge;
	
	public  User(String userName, int userAge) {
		this.userName = userName;
		this.userAge = userAge;
	}
	
	@Override
	public String toString() {
		return String.format("%s %d살", userName, userAge);
	}
	
}
