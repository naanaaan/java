package practice.ch08.ex03;

public class Main {
	public static void main(String[] args){
		Driver driver = new Driver();
		Bus bus = new Bus();
		Texi texi = new Texi();
		
		driver.drive(bus);
		driver.drive(texi);
		
		Vehicle vehicle = new Bus();
		vehicle.run(); //버스stop못씀
		Bus bus2 = (Bus)vehicle;
		bus2.stop();
	}
}
