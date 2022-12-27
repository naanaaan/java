package ch05.home.ex01.case04;

import java.time.LocalDate;

public class User {
	private String userName;
	private String age;
	LocalDate joinDate;
	boolean run1;
	boolean run2;
	
	
	public void setUserName(String userName, boolean run1) {
		this.userName = userName;
		this.run1 = run1;
	}
	
	public String getuserName() {
		return this.userName;
	}
	
	public void setage(String age, boolean run2) {
		this.age = age;
		this.run2 = run2;
	}
	
	public String getage() {
		return this.age;
	}
	
	public void setjoinDate() {
		if(this.run1 == true && this.run2 == true) this.joinDate = LocalDate.now();
	
	}
	
	public LocalDate getjoinDate() {
		return this.joinDate;
	}
}
