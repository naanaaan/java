package ch07.ex05.case08;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Dove dove = new Dove();
		Duck duck = new Duck();
		LeoPard leopard = new LeoPard();
		Lion lion = new Lion();
		
		List<Creeper> pen = new ArrayList<>();
		pen.add(lion);
		pen.add(leopard);
//		pen.add(dove); 컴파일에러
		
		List<Bird> cage = new ArrayList<>();
		cage.add(dove);
		cage.add(duck);
//		cage.add(lion);컴파일에러
		
		for(Creeper creeper: pen) creeper.walk();
		
		for(Bird bird: cage) bird.fly();
		
		
	}
}
