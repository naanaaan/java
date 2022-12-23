package ch04.home.ex01;

import java.util.Scanner;

public class Grade {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String grade = null ;
		System.out.printf("점수: ");
		int gradeinput = sc.nextInt();
		
	
		if( gradeinput >= 90) grade = "A";
		else if( gradeinput >= 80) grade ="B";
		else grade = "C";
		
		if( gradeinput%10 >= 8 || gradeinput == 100) grade += "+"; 
		else if( gradeinput%10 < 3 && gradeinput >= 80) grade += "-";
		
		System.out.println(grade);
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