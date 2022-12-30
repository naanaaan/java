package ch05.home.ex06.case02;

import java.util.Scanner;

public class Console {
	private static Scanner sc;
	
	static {
		sc = new Scanner(System.in);
	}
	
	private static void inMsg(String msg) {
		System.out.print(msg + "\n> ");
	}
	
	public static String inStr(String msg) {
		Console.inMsg(msg);
		String inputStr = sc.nextLine().trim();
		if(inputStr.matches("[a-zA-Zㄱ-ㅎ가-힣]+")) {
			return inputStr;
		}
		else {
			Console.err("문자가 아닙니다.\n");
			return inStr(msg);
		}
	
	}
	
	public static int inNum(String msg) {
		Console.inMsg(msg);
		String inputNum = sc.nextLine();
		if(inputNum.matches("[1-9]+")) return Integer.parseInt(inputNum);
		else {
			Console.err("자연수가 아닙니다.\n");
			return inNum(msg);
		}
	
	}
	
	public static void info(String msg) {
		System.out.print(msg);
	}
	
	public static void err(String msg) {
		System.out.print("ERROR] " + msg);
	}
}
/*
과제: ch05.ex06.case02.Console 을 고도화 하라.
예외 처리를 하라.
Cosole.inStr() : 문자를 입력한다
Console.inNum() : 자연수를 입력한다.
--

문자를 입력하세요.
>
ERROR] 문자가 아닙니다.
> hello
숫자를 입력하세요.
> 
EROOR] 한자리 자연수를 입력하세요.
숫자를 입력하세요.
> 12
EROOR] 한자리 자연수를 입력하세요.
> 1
끝
*/