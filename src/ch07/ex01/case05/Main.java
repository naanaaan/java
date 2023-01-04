package ch07.ex01.case05;

public class Main {
	public static void main(String[] args) {
		Car car =new FireEngine();
		car.run();
//		car.water(); 컴파일 에러
		
		FireEngine fireEngine = (FireEngine) car;
		
		fireEngine.water();
		fireEngine.run();
		
		((Car)fireEngine).run();
	}
}
