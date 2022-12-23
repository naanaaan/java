package ch04.home.ex02;

import java.util.Scanner;

public class C05teacher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int playerChoice = 0;
		int appChoice = 0;
		String result = "";
		String choice = "";
		
		System.out.print("1.가위, 2.바위, 3.보\n>");
		playerChoice = sc.nextInt();
		appChoice = (int) (Math.random()*3)+1;
		
		if(1 <= playerChoice && playerChoice <= 3) {
			result = switch(playerChoice - appChoice) {
			case -2, 1 -> "win";
			case -1, 2 -> "lose";
			default -> "Fair";
			};
			
			choice = switch(playerChoice) {
			case  1 -> "가위";
			case  2 -> "바위";
			default -> "보";
			};
			System.out.println("You: " + choice);
			
			choice = switch(appChoice) {
			case  1 -> "가위";
			case  2 -> "바위";
			default -> "보";
			};
			System.out.println("Me: " + choice);
			
		} else result = "ERROR";
		
		System.out.println(result);
	}

}
