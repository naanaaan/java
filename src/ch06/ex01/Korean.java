package ch06.ex01;

public class Korean {
	String nation = "대한민국";
	String name;
	String ssn;
	
//	public Korean(String n, String s) {
//		name = n;
//		ssn = s;
//	}
	public Korean(String name, String ssn) {//매개변수가 더 우선순위가 높아 필드를 이용못해 this를쓴다
		this.name = name;  //this.name은 필드의 name
		this.name = ssn;
	}
}
