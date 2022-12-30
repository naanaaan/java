package ch05.home.ex05.case08;

public class Person {
	private String name;
	
	public void setName(String name) {
		this.name = name;
	}

	
	public Ball pass(Ball ball, String name) {
		ball.setHavePerson(name);
		return ball;
	}
	
	public void shoot(Ball ball) {
	}
}
