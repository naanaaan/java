package ch07.ex04;

public class ChildExample {
	public static void main(String[] args) {
		Child child = new Child();
		
		Parent parent = child; //자동타입변환
		
		parent.method1();
		parent.method2();  //override된 매소드 호출된다 즉 부모매소드 못가져옴
//		parent.method3(); Child클래싀이 매소드3이 아니다 못가져온다.
	}
}
