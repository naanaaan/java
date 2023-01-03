package ch08.ex05;

public class MyClassB implements MyInterface {
	public void method1() {
		System.out.println("myclassB method1실행");
	}
	@Override
	public void method2() {
		System.out.println("myclassB method2실행");
	}
}
