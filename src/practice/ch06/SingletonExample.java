package practice.ch06;

public class SingletonExample {
	public static void main(String[] args) {
//		Singleton obj1 = new Singleton();  컴파일에러
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
//		둘이 같은 객체이다./
	}
}
