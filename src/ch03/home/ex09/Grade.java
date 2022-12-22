package ch03.home.ex09;

import java.util.Scanner;

public class Grade {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double sum = 0;
		double avg = 0;
	
		
		
		System.out.print("국어: ");
		int kor = sc.nextInt();
		System.out.print("영어: ");
		int eng = sc.nextInt();
		System.out.print("수학: ");
		int math = sc.nextInt();
		System.out.println();
		
		sum = kor + eng + math;
		avg = (int)((sum/3)*10)/10.0; 
		char grade = avg >= 90 ? 'A' : (avg >=80 ? 'B' : 'C');
		
		System.out.println("총점: " + sum);
		System.out.println("평균: " + avg) ;
		System.out.println("학점: " + grade);
//		소수점조정할때 prinf에서 %.1f를쓰면 더 편하게 만들 수 있따.
	}
}
/*
 * 
 * 
 * 국어, 영어, 수학 점수를 입력한다
 *  총점, 평균, 학점을 출력한다. 
 *  평균점수는 소수점 이하 한자리까지만 출력한다.
 * 
 * 평균은 90 <= mean <= 100 : A 평균은 80 <= mean < 90 : B mean < 80 : C
 *  -- 
 * 국어: 95 
 * 영어: 100 
 * 수학: 100
 * 
 * 총점: 295 
 * 평균: 98.3 
 * 학점: A
 *  
 * 
 * 
 * 
 */