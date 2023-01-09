package ch07.ex07.case03;

public class Main {
	public static void main(String[] args) {
//		case1  리턴명령어만ㄴ 있음 블럭생략가능
//		but 리턴외에 명령어 있을시 블럭명령어 써야함
		Calculator calculator = (int x, int y) -> {
			int result = x + y;
			return result;
		};
//		case2 실전은 case2
		calculator = (a, b) -> a + b;
		
		System.out.println(calculator.calc(1, 2));
	}
}
