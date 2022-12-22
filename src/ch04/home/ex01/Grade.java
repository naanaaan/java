package ch04.home.ex01;

import java.util.Scanner;

public class Grade {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.printf("점수: ");
		int gradeinput = sc.nextInt();
			
		if( gradeinput >= 90) {
			String grade = (gradeinput >= 98 || gradeinput < 93) ? "A+" : "A-";
		}else if( gradeinput >= 80) {
			
		}else {
			
		}
		
	}
}
/*
  다음 구간별로 학점을 부여하라.
  98 이상 A+
  94 이상 A
  90 이상 A-
  88 이상 B+
  84 이상 B
  80 이상 B-
  80 미만 C
  --
  점수: 100
  A+
 
*/