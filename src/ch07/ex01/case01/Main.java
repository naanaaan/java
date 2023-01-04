package ch07.ex01.case01;

public class Main {
	public static void main(String[] args) {
		C c = new C();
		B b = c;
		A a = c;
//		객체는 C Class로만 만들수 있고 타입은 인터페잇A B로 바꿀수 이씀
//		위는 자동타입변환
		
//		강제타입변환
		c = (C)a;
		c = (C)b;
		
		b = (B)a;
		
//		String s = (String)c; String타입없어서 컴파일 에러
		
	}
}
