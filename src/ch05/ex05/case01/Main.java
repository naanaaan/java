package ch05.ex05.case01;

public class Main {
	public static void main(String[] args) {
		Calculator cal = new Calculator();

		int result = cal.add(2, 2); //main메서드가 cal.add를 콜했따
		result = cal.add(2, 2, 2);
		
		System.out.println(result);
	}
}
