package ch04.home.ex04;

import java.util.Scanner;

public class H02Calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String aInput = "";
		String bInput = "";
		String opInput = "";
		String yn = "";
		int result = 0;
		boolean run = true;
		boolean runA = false;
		boolean runB = false;
		boolean runOp = false;
//			계산기 시작
		do {
//			a값 입력
			do{
				System.out.print("a: ");
				aInput = sc.nextLine();
				if(!(aInput.matches("^[0-9]+$"))) {
					System.out.println("a값을 다시 입력하세요.");
					runA = true;
				}else runA = false;
			} while (runA);

//			op값 입력
			do {
				System.out.print("op: ");
				opInput = sc.nextLine();
				switch (opInput) {
				case "+", "-", "*", "/" -> runOp = false;
				default -> {
					System.out.println("연산자를 다시 입력하세요.");
					runOp = true;
				}
				}
			} while (runOp);

//			b값입력
			do{
				System.out.print("b: ");
				bInput = sc.nextLine();
				if(!(bInput.matches("^[0-9]+$"))) {
					System.out.println("b값을 다시 입력하세요.");
					runB = true;
				}else runB = false;
			}while(runB);
		
//			값 int로 변환
			int a = Integer.parseInt(aInput);
			int b = Integer.parseInt(bInput);
			
//			계산 결과
			switch (opInput) {
			case "+" -> result = a + b;
			case "-" -> result = a - b;
			case "*" -> result = a * b;
			case "/" -> result = a / b;
			}
			System.out.printf("%d %s %d = %d\n", a, opInput, b, result);

//			continue
			System.out.print("continue(y/n)? ");
			yn = sc.nextLine();
			switch (yn) {
			case "y", "Y" -> run = true;
			default -> {
				run = false;
				System.out.println("끝");
			}
			}
		} while (run);
	}
}
/*
과제 : 계산기를 만들어라.
연산자는 +, -, *, / 이다.
입력값 a b는 0또는 자연수
continue의 y 또는 Y를 입력하면 계산 잡업을 재수행한다.
y 또는 Y외를 입력하면 앱을 종료한다.
/ 는 몫만을 구한다.
--

a: 1
op: +
b: 2
1 + 2 = 3
continue(y/n)? y
a: 2
op: *
b: 2
2 * 2 =4
continue(y/n)? n
end.abstract
*/