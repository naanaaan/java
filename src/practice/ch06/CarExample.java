package practice.ch06;

public class CarExample {
	public static void main(String[] args) {
		Car car = new Car();
		car.setGas(10);
		
		boolean gasState = car.isLeftGas();
		if(gasState) {
			System.out.println("출발합니다.");
			car.run();
		}
		
		if(car.isLeftGas()) {
			System.out.println("가스를 주입할 필요가 없습니다.");
		}else {
			System.out.println("gas를 주입하세요");
		}
	}
}
