package ch07.ex06;

public class DriverExample {
	public static void main(String[] args) {
		Driver driver = new Driver();
		Vehicle vehicle = new Vehicle();
		Bus bus = new Bus();
		Texi texi = new Texi();
		
		driver.driver(vehicle);
		driver.driver(bus);
		driver.driver(texi);
	}
}
