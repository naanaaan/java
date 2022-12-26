package ch05.check;

import java.util.Scanner;

public class C05_9check {
	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner sc = new Scanner(System.in);
		int max = 0;
		int sum = 0;
		double avg = 0;
		
		while(run) {
			System.out.println("--------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3. 점수리스트 | 4.분석 | 5.종료");
			System.out.println("--------------------------------");
			System.out.print("선택> ");
			
			int selectNo = sc.nextInt();
//			작성위치 1~4까지	
			if(selectNo == 1) {
				System.out.print("학생수> ");
				 selectNo = sc.nextInt();
				 studentNum = selectNo;
				 scores = new int[studentNum];
			}else if(selectNo == 2) {
				for(int a = 0; a < studentNum; a++) {
					System.out.printf("scores[%d]> ", a);
					 selectNo = sc.nextInt();
					 scores[a] = selectNo;
				}
			}else if(selectNo == 3) {
				for(int a = 0; a < studentNum; a++) {
					System.out.printf("scores[%d]> %d\n", a, scores[a]);
				}
			}else if(selectNo == 4) {
				for(int a = 0; a < studentNum; a++) {
					if(scores[a] > max) max = scores[a];
					sum += scores[a];
				}
				avg =  (1.0*sum / scores.length);
				System.out.printf("최고 점수: %d\n", max );
				System.out.printf("평균 점수: %.1f\n", avg);
			}else if(selectNo == 5) {
				run = false;
			}
		}
		
		System.out.println("프로그램종료");
	}
}
