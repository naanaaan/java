package ch06.ex09Singleton;

public class SingletonExample {
	public static void main(String[] args) {
		/*
		 Singleton obj1 = new Singleton(); 컴파일에러
		 new호출불가
		 */
		Singleton obj1 = Singleton.getsingleton(); //서로 같은 객체이다.
		Singleton obj2 = Singleton.getsingleton();
		
		if(obj1 == obj2) System.out.println("같은 객체입니다.");
		else System.out.println("다른 객체입니다.");
	}
}
