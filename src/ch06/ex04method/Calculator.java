package ch06.ex04method;

public class Calculator {
	
	void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	
	
	int plus(int x, int y) {
		int result = x + y;
		return result;
	}
	
	double divide(int x, int y) {
		double result = 1.0*x / y; 
		return result;
	}
	
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
}
