package ch04.home.ex02;

import java.util.Scanner;

public class H05Kawibawibo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int	comInput = (int) (Math.random() * 3) + 1;
		String result = "";
		String meSelect = "";
		String comSelect = "";
		int selectInput = 0;
		int minus = 0;
	
//		가위바위보 시작 
		System.out.print("1.가위, 2.바위, 3.보\n>");
		
		selectInput = sc.nextInt();
		
		switch (selectInput) {
		case 1 -> meSelect = "가위";
		case 2 -> meSelect = "바위";
		case 3 -> meSelect = "보";
		}
		
		switch (comInput) {
		case 1 -> comSelect = "가위";
		case 2 -> comSelect = "바위";
		case 3 -> comSelect = "보";
		}
		
		minus = selectInput - comInput;
		
		if( minus == 1 || ( selectInput == 1 && minus == -2)) {
			result = "You win.";
		}
		else if( selectInput == comInput) { 
			result = "Fair.";
		}
		else if(  minus == -1 || ( selectInput == 3 && minus == 2)) {
			result = "You lose.";
		}else result = "값을 잘못입력하셨습니다.";
		
//		게임종료 and 결과----------------------------------------
		System.out.printf("You: %s\n",  comSelect);
		System.out.printf("Me: %s\n", meSelect);
		System.out.println();
		System.out.println(result);
	}

}
/*
 * 과제 : 앱과 가위바위보를 하라. 게임 결과를 출력하라. 결과는
 * You win.
 * You lose.
 * Fair. 무승부
 * 중 하나이다.
 * --
 * 1.가위, 2.바위, 3.보
 * >1
 * You: 가위
 * Me: 보
 * 
 * You win.
 *  
 *
*/