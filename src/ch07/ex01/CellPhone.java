package ch07.ex01;

public class CellPhone {
	String model;
	String color;

	public CellPhone (String model, String color) {
		this.model = model; //부모생성자이며 super에 호출당함
		this.color = color;
	}
	
	void powerOn() {
		System.out.println("전원을 켭니다.");
	}

	void powerOff() {
		System.out.println("전원을 끕니다.");
	}

}
