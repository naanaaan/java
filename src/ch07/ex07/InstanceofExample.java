package ch07.ex07;

public class InstanceofExample {
	public static void method1(Parent parent) {
		if (parent instanceof Child) {
			Child child = (Child) parent;
			System.out.println("method1 - Child 변환 성공");
		} else {
			System.out.println("method1 - Child 변환 실패");
		}
	}
	
	public static void method2(Parent parent) {
		Child child = (Child) parent;
		System.out.println("method2 - Child로 변환 성공");
	}
	

	public static void main(String[] args) {
		Parent parentA =  new Child();
		method1(parentA);
		method2(parentA);
		
		Parent parentB =  new Parent();
		method1(parentB); //변환실패 이유는 상속의 강제타입변환은 자동타입변환이후에 가능하기떄문에
		method2(parentB); //에러발생

	}
	
}
