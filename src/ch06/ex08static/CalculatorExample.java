package ch06.ex08static;

public class CalculatorExample {
	public static void main(String[] args) {
		double result1 = 10 * 10 * Calculator.pi; //정적인 속성은 인스턴스의 각각의 매개변수가 아닌 모든 인스턴스에게 공통적인 부분을 말한다.
		int result2 = Calculator.plus(10, 5);	//일방적으로 클래스.매소드로 한다.\
		int result3 = Calculator.minus(10, 5);
		
		System.out.println("result1: " + result1);
		System.out.println("result2: " + result2);
		System.out.println("result3: " + result3);
	}
}
