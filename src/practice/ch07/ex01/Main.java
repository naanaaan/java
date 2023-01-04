package practice.ch07.ex01;

public class Main {
	public static void main(String[] args) {
		Bus bus = new Bus();
		Texi texi = new Texi();
		Driver driver = new Driver();
		
		new Driver().drive(bus);
		driver.drive(bus);
		driver.drive(texi);
		
	}
}
