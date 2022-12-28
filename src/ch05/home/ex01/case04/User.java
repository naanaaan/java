package ch05.home.ex01.case04;

import java.time.LocalDate;

public class User {
	private String userName;
	private String age;
	private LocalDate joinDate;
	
	
	public void setUserName(String userName) {
		this.userName = userName;
		
	}
	
	public String getuserName() {
		return this.userName;
	}
	
	public void setage(String age) {
		this.age = age;
	}
	
	public String getage() {
		return this.age;
	}
	
	public void setjoinDate() {
		this.joinDate = LocalDate.now();
	
	}
	
	public LocalDate getjoinDate() {
		return this.joinDate;
	}
}
