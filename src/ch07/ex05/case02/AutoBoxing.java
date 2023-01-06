package ch07.ex05.case02;

public class AutoBoxing {
	public static void main(String[] args) {
//		기본타입 int double등 이런걸 객체로 만드는 기술?
		System.out.println(add(1, 2));
		//자동 autuunboxing이고
		
		
	}
//	autoboxing
	private static int add(Integer a, Integer b) {
		return a + b; //숫자로 더해야해서 언박싱임
	}
}
