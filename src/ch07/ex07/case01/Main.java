package ch07.ex07.case01;

public class Main {
	public static void main(String[] args) {
		Human human = () -> System.out.println("hello");
//		say매서드를 human이란 변수에 담은 것이다.
//		lamda라고 한다.
		human.say(); //쓸떄는 이렇게.
	}
}
