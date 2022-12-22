package ch03.ex10;

public class C02Final {
	public static void main(String[] args) {
		final int MAX = 3;
//		MAX = 1; final을 쓰면 변수를 상수로 만들어 수정 불가능
		
		double area = 3.14 * 3 * 3;
		
		final double PI = 3.14;
		int r = 3;
		area = PI * r * r;
		
	}
}
