package ch07.ex01.case02;

public class Main {
	public static void main(String[] args) {
		C c = new C();		
		B b = c;
		A a = c;
		Object o = c;
//		A클래스에 Object가 생략됨
		
		c = (C)o;
		c = (C)a;
		c = (C)b;
		
		b = (B)a;
		b = (B)o;
			
	}
}
