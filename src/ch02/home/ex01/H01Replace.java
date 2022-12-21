package ch02.home.ex01;

public class H01Replace {
	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		int temp = 0; //임시변수
		temp = b;
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		b = a;
		a = temp;
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}
}
//과제 : 두 변수의 데이터를 교환하라.
//a: 1, b: 2 교환 후 a:2. b: 1