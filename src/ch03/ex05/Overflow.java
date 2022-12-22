package ch03.ex05;

public class Overflow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1_000_000;
		int b = 1_000_000;
		
		long c = a + b;
		System.out.println(c);
		
		c = a * b;
		System.err.println(c);
		
		c = (long)a * b;
		System.out.println(c);
		
		int x = a * b / a;
		System.out.println(x);
		x = a / b * a; // 왼쪽부터 적용되므로 /이 long타입으로바꾼다.
		System.out.println(x);
	}

}
