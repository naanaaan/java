package ch02.ex01;

import java.util.Scanner;

public class CO3Input {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("문자열을 입력하세요.\n> ");
//		
//		
//		sc.nextLine();
//		System.out.println("입력했습니다.");

//		과제: '<입력값>을 입력했습니다.'를 출력하라.
//		System.out.println(sc.nextLine() + "을 입력했습니다.");
//		String str = sc.nextLine(); //soft coding
////		String str = "hello"; hard coding
//		
////		System.out.println(str + " 을 입력했습니다.");
//		System.out.printf("%s을 입력했습니다.\n", str); //답
//		
//		System.out.printf("숫자를 입력하세요.\n> ");
//		int int1 = sc.nextInt();
//		System.out.println(int1 + "을 입력했습니다.");
//		int1 = sc.nextInt(); sc.nextLine(); // 해결책 3을누르고 엔터를 누르기때문
//		System.out.println(int1 + "을 입력했습니다");
//		System.out.print("문자열을 입력하세요.\n");
//		String str2 = sc.nextLine();   //
//		System.out.println(str2 + "을 입력했습니다."); // 버그다  3엔터 는 3\n입력이므로 문제가 생김
		
		System.out.print("문자를 입력하세요.\n>");
		char c = sc.nextLine().charAt(0); //hellow의 h만 출력 chartAt가 그런 class
		System.out.println(c + "을 입력했습니다.");
	}
}
