package ch04.home.ex05;

public class H01Gugudan {

	public static void main(String[] args) {
		int a = 0;
		int b = 0;
		int result = 0;
		for(a = 2; a < 10; a++) {
			for(b = 1; b < 10; b++) {
				result = a * b;
				System.out.printf("%d * %d = %d\n", a, b, result);
			}
			System.out.println();
		}
	}

}
/*
과제ㅣ 구구단을 출력하라.
2 * 1 =2
2 * 9 = 18
부터
9 * 9까지


*/
