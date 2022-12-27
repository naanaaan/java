package ch06.ex03This;

public class Car {
	String company= "현대자동차";
	String model;
	String color;
	int maxspeed;
	
	//생성자
	Car(){}
	
	Car(String model){
//		this.model = model이 아닌 this() 이걸 쓰는 이유는 중복코드 줄이기위해
		this(model, "은색", 250);
	}
	Car(String model, String color){
		this(model, color, 250);
	}
	Car(String model, String color, int maxspeed){ // 위 생성자를 호출한다 공통 실행 코드
		this.model = model;
		this.color = color;
		this.maxspeed = maxspeed;
	}
}
