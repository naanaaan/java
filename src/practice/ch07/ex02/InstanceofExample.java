package practice.ch07.ex02;

public class InstanceofExample {
	public static void method1(Parent parent) {
		if(parent instanceof Child) {
			Child child = (Child)parent;
			System.out.println("Child로 변환 성공");
		}else {
			System.out.println("Child로 변환 불가");
		}
	}
	
	public static void method2(Parent parent) {
		Child child = (Child)parent;
		System.out.println("Child로 변환 성공");
	}
	
	public static void main(String[] args) {
		Parent parentA = new Parent();
		
		InstanceofExample.method1(parentA);
//		InstanceofExample.method2(parentA);  //컴파일 에러
		
		Parent parentB = new Child();
		
		InstanceofExample.method1(parentB);
		InstanceofExample.method2(parentB);
	}
}
