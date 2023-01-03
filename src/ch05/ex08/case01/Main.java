package ch05.ex08.case01;

public class Main {
	public static void main(String[] args) {
		Baby baby = new Baby(); //new가 실행돼서 객체가 만들어진다
		baby.setBabyName("초롱이");
		
		baby = new Baby("튼튼이");
	}
} 
