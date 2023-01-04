package practice.ch08.ex02;

public class CarExample {
	public static void main(String[] args) {
		Car car = new Car();
		car.run();
		
		car.tires[0] = new KumhoTire();
		car.tires[1] = new KumhoTire();
		System.out.println();
		
		car.run();
	}
}
