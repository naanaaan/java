package ch05.home.ex06.case02;

public class Main {
	public static void main(String[] args) {
		Console.inStr("문자를 입력하세요.");
		Console.inNum("숫자를 입력하세요.");
		

		Console.info("끝");
	}
}
/*
과제: ch05.ex06.case02.Console 을 고도화 하라.
예외 처리를 하라.
Cosole.inStr() : 한글자 이상 입력한다.
Console.inNum() : 한자리 자연수를 입력한다.
--

문자를 입력하세요.
>
ERROR] 한글자 이상 입력하세요.
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