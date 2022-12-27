package ch06.ex09Singleton;

public class Singleton {
//	정적 필드  외부에서 new못씀  내부에서는 new연산자로 생성자 호출 가능
//	그래서 private static 클래스 변수 = new 클래스(); 외부에서 new를 못쓰기때문에 변수에 new 클래스로 객체생성 변수를 만들고 
//	아래 메소드 리턴값을 변수로 두어 외부에서 호출가능해짐
	private static Singleton singleton = new Singleton();
	
	private Singleton( ) {} //생성자 초기화
	
	static Singleton getsingleton( ){
		return singleton;
	}
}
