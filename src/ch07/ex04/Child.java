package ch07.ex04;

public class Child extends Parent{
	
	@Override
	public void method2() {
		System.out.println("Child-method2"); //재정의
	}
	
	public void method3() {
		System.out.println("Child-method3");
	}
}
