package ch06.ex02.case01.sub;

import ch06.ex02.case01.A;

public class C extends A {
	public void test() {
		int x = 0;
		
//		x = this.a; private
//		x = this.b; default
		x = this.c; //protected는 자식이면 가능
		x = this.d;
		
//		this.m1();
//		this.m2();
		this.m3();
		this.m4();
	}
}
