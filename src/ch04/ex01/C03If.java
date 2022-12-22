package ch04.ex01;

public class C03If {
	public static void main(String[] args) {
		int hour = 22;
//		중복코드가 많아 나쁜 코드
//		String output = "";요거이용하면만들수있음
		if (hour < 12) {
			System.out.println("Good Morning");
		} else if (hour < 18) {
			System.out.println("Good Afternoon");
		} else if (hour < 21) {
			System.out.println("Good Evening");
		} else {
			System.out.println("Good Night");

		}
//		과제 : println()을 한번만 사용하라.
//		7~15 line을 개선하라.
	}
}
