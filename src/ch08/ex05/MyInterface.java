package ch08.ex05;

public interface MyInterface {
	public abstract void method1();
	
	public default void method2() {
		System.out.println("MyInterface-method2");
	}
}
