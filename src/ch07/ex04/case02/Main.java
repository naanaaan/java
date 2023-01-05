package ch07.ex04.case02;

public class Main {
	public static void main(String[] args) {
		Cat[] cats = new Cat[3];
		
		cats[0] = new Cat("헤롱이");
		cats[1] = new Cat("야코미");
		cats[2] = new Cat("새코디");
		
//		cats[2] = new Dog(); 타입달라 컴파에러
		
		for(Cat cat: cats) System.out.println(cat);
	}
}
