package ch04.home.ex05;

public class H02_369 {

	public static void main(String[] args) {
		int a = 0;
		int b = 0;
		for (a = 1; a <= 9; a++) {
			
				if (a % 3 == 0)System.out.print(a + "짝 ");
				else System.out.print(a + " ");
			
		}
	}

}
/*
과제 : 369 게임을 하라. 
숫자는 1 이상 99 이하이다.
10단위로 새로운 줄에 출력하라.
--
1 2 3짝 4 5 6짝 7 8 9짝 10
11 12 13짝 14 15 16짝 17 18 19짝 20

91짝 92짝 93짝짝 94짝 95짝 96짝짝 97짝 98짝 99짜짝
*/