package ch06.ex02.case01.sub;

import ch06.ex02.case01.A;

public class B {
	public void test() {
		A a = new A();
		
		int x =  0;
//		x = a.a; 컴파일에러
//		x = a.b; default
//		x = a.c; protected
		x = a.d; 
		
		//a.m1();
//		a.m2(); default
//		a.m3(); protected
		a.m4();
	}
}
