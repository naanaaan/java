package ch08.ex02;

public class CarExample {
	public static void main(String[] args) {
		Car car = new Car();
		
		car.run();
		
		car.tires[0] = new KumhoTire();
		
		car.run();
	}
}
