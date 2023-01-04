package practice.ch08.ex02;

public class Car {
	public Tire[] tires = {
		new HankookTire(),
		new HankookTire(),
		new HankookTire(),
		new HankookTire()
	};
	
	public void run() {
		for(Tire tire : tires) {
			tire.roll();
		}
	}
}
