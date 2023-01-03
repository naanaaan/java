package ch08.ex03;

public class DriverExample {
	public static void main(String[] args) {
		Driver dr = new Driver();
		Bus bus = new Bus();
		Texi texi = new Texi();
		
		dr.drive(new Bus());
//		자동타입변환
		dr.drive(bus);
		dr.drive(texi);
		
//		강제타입변환
		Vehicle vehicle = new Bus();
		vehicle.run();
//		vehicle.stop(); 못씀
		Bus bus2 = (Bus) vehicle;
		bus2.stop();
		
		
	}
}
