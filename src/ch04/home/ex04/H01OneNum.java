package ch04.home.ex04;

import java.util.Scanner;

public class H01OneNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = "";
		boolean run = true;
		
		do {
			System.out.print("한자리 자연수를 입력하세요.: ");
			input = sc.nextLine();
			switch(input) {
			case  "1", "2", "3","4", "5", "6","7", "8", "9" -> {
				String message = input + "을 입력하셨습니다.";
				System.out.println(message);
				run = false;
				}
			default -> System.out.println(input + "을 입력하셨습니다.");
			}
			
		}while(run);
		
//		System.out.println(input + "을 입력하셨습니다.");
	}
}
/*
과제 : 한자리 자연수를 입력받아라.
*/