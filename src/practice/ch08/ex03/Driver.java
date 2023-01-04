package practice.ch08.ex03;

public class Driver {
	public void drive(Vehicle vehicle) {
		vehicle.run();
	}
	
	public void drive2(Vehicle vehicle) {
		if(vehicle instanceof Bus ) {
			Bus bus = (Bus)vehicle;
			System.out.println("강제타입변환");
		}else {
			System.out.println("실패");
		}
	}
}
