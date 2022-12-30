package ch05.home.ex05.case08;

public class Main {
	public static void main(String[] args) {
		Ball ball = new Ball();
		Person person1= new Person();
		Person person2= new Person();
		Person person3= new Person();
		
		person1.setName("최한석");
		person2.setName("한아름");
		person3.setName("양승일");
		
		ball.setHavePerson("최한석");
		person1.pass(ball, "한아름");
		person2.pass(ball, "양승일");
		person2.shoot(ball);
		
	}
}
/*
최한석, 한아름, 양승일이 축구를 한다.
한석이가 아름이한테 공을 패스한다.
아름이는 승일이한테 공을 패스한다.
승일이는 공을 찬다.
*/