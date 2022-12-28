package ch05.home.ex02.case02;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		String msg = "";
		String userName = "";
		
		Scanner sc = new Scanner(System.in);
		boolean isGood = false;

		do {
			System.out.print("메세지: ");
			msg = sc.nextLine();
		} while (isGood);

		do {
			isGood = false;
			System.out.print("작성자명: ");
			userName = sc.nextLine();
			isGood = userName.matches("[a-zA-Z가-힟]+");
			if(!isGood) System.out.println("[ERROR] 영어한글만 입력가능합니다.");
		} while (!isGood);
		
		Paper paper = new Paper();
		paper.setMsg(msg);
		paper.setUserName(userName);

		System.out.println();
		System.out.printf("%s from %s", paper.getMsg(), paper.getUserName());
	}
}
/*
과제: 종이에 메세지와 작성자명을 기록하라.
ㅡㅡ

메시지: hello
작성자명: terry

hello from terry.
*/
//피드백 do 사이에 공백과 Paper 클래스이 쓰레기공백, Main 클래스 들여쓰기 내어쓰기 
//앱실행시 값을 실제처럼 입력