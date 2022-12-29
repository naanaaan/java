package ch07.ex03;

public class AirplaneExample {
	public static void main(String[] args) {
		AirplaneSon sa = new AirplaneSon();
		
		sa.takeOff();
		sa.fly();
		sa.flyMode = AirplaneSon.SUPERSONIC;
		sa.fly();
		sa.flyMode = AirplaneSon.NORMAL;
		sa.fly();
		sa.land();
	}
}
