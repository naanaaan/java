package com.my.hr.presentation;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.Scanner;

public interface Console {
	Scanner sc = new Scanner(System.in);
	
	public static void info(Object obj) {
		System.out.print(obj);
	}
	
	public static void inMsg(String msg) {
		System.out.println(msg + ": ");
	}
	
	public static int inNum() {
		int input = 0;
		input = sc.nextInt();
				sc.nextLine();
		return input; 
	}
	
	public static void err(String msg) {
		System.out.println("ERROR] " + msg);
	}
	
	public static String inName(String msg) {
		String input = "";
		boolean isGood1 = false;
		boolean isGood2 = false;
 		do {
			Console.info(msg);
			input = sc.nextLine().trim();
			isGood1 = input.matches("[가-힣]+");
			isGood2 = input.length() <= 5;
			if(!isGood1) Console.err("한글만 입력가능합니다.");
			if(!isGood2) Console.err("5글자이하만 입력가능합니다.");
		}while(!isGood1 | !isGood2);
		return input;
	}
	
	public static LocalDate inJoinDate() {
		LocalDate joinDate = null;
		int year = 0;
		int month = 0;
		int day = 0;
		boolean isGood = false;
		do {
			do {
				Console.info("입사년도를 입력하세요.\n>");
				year = sc.nextInt(); sc.nextLine();
				isGood = 0 <= year && year <= 9999;
				if(!isGood) Console.err("올바른 숫자를 입력해주세요.");
			}while(!isGood);
			
			do {
				Console.info("입사월을 입력하세요.\n>");
				month = sc.nextInt(); sc.nextLine();
				isGood = 1 <= month && month <= 12;
				if(!isGood) Console.err("1에서 12까지의 숫자만 입력하세요.");
			}while(!isGood);
			
			do {
				Console.info("입사일을 입력하세요.\n>");
				day = sc.nextInt(); sc.nextLine();
				isGood = 1 <= day && day <= 31;
				if(!isGood) Console.err("1부터 31까지의 숫자만 입력하세요.");
			}while(!isGood);
			try {
				joinDate = LocalDate.of(year, month, day);
			}catch(DateTimeException e) {
				Console.err(month + "월에는 " + day + "가 없습니다.");
				isGood = false;
			}
		}while(!isGood);
		return joinDate;
	}
	
	public static int inMenuNum(String msg) {
		String input = "";
		boolean isGood = false;
		do {
			Console.info(msg);
			input = sc.nextLine().trim();
			isGood = input.matches("[0-4]");
			if(!isGood) Console.err("올바른 숫자를 입력해주세요.");
		}while(!isGood);
		return Integer.parseInt(input);
	}
}
