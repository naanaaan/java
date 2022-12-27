package ch06.ex02OverLoading;

public class Car {
	String company = "현대자동차";
	String model;
	String color;
	int maxspeed;
	
	//생성자
	Car(){}
//	오버로딩   but   Car (a,b)  Car(b, a) 는 오버로딩 아님
	Car(String model){
		this.model = model;
	}
	Car(String model, String color){
		this.model = model;
		this.color = color;
	}
	Car(String model, String color, int maxspeed){
		this.model = model;
		this.color = color;
		this.maxspeed = maxspeed;
	}
}
