package ch05.ex06.case01;

public class Main {
	public static void main(String[] args) {
		Man.say("I love java. ");
//		Man.tell("")호출불가
		
		Man man = new Man();
		man.tell("I LOVE JAVA.");
		man.say("Hello. "); //이렇게씀ㄴ 인스턴스매소드라 착각할 수 있음
		
	}
}
