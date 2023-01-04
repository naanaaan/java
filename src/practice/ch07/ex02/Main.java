package practice.ch07.ex02;

public class Main {
	public static void main(String[] args) {
		Child child = new Child();
		
		Parent parent = child;
		
		parent.method1();
		parent.method2(); //오버라이딩 x
//		parent.method3(); 자식class꺼라 못씀
		
		child = (Child)parent;
		child.method1();
		child.method2(); //오버라이딩
		child.method3();
	}
}
