package ch07.ex01;

public class DmbCellPhone extends CellPhone {
	
	int channel;
	
	
	
	DmbCellPhone (String model, String color, int channel){
		super(model, color);  //부모생성자를 호출시킨다
		this.channel = channel;
	}
	
	void turnOnDmb() {
		System.out.println("채널: " + channel + "입니다.");
	}
	void turnOffDmb() {
		System.out.println("Dmb를 끕니다.");
	}
}
