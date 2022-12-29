package ch05.ex05.case02;

public class Main {
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		
		double result = cal.add(1, 2);
		
		System.out.println(result);
		
		result = cal.add(1, 2);
		System.out.println(result);
		
	}
}
