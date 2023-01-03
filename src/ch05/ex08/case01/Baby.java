package ch05.ex08.case01;

public class Baby {
	private String babyName;
	
	public Baby() {}
	
	public Baby(String babyName) {
		this.babyName  = babyName;
		//객체생성할떄 맴버변수값넣기
	}
	
	
	public void setBabyName(String babyName) {
		this.babyName = babyName; //객체생성뒤에 맴버변수값넣기
	}
}
