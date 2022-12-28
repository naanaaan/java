package ch05.home.ex01.case04;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		User user = new User();
		String inputName = "";
		String inputAge = "";
		int age = 0;
		boolean isGood = false;

		do {
			do {
			System.out.print("이름: ");
			inputName = sc.nextLine();
			user.setUserName(inputName);
			isGood = inputName.matches("[a-zA-Z가-힟]+");
			if(!isGood) System.out.println("잘못입력하셨습니다.");
			}while(!isGood);
			do {
				System.out.print("나이: ");
				inputAge = sc.nextLine();
				user.setage(inputAge);
				isGood = inputAge.matches("[0-9]+");
				if(!isGood) System.out.println("다시 입력해주세요.");
			} while (!isGood);
		} while (!isGood);

		System.out.println();
		user.setjoinDate();
		System.out.println("이름: " + user.getuserName());
		System.out.println("나이: " + user.getage());
		System.out.println("가입일: " + user.getjoinDate());
	}

}

/*
과제: 사용자를 생성하라.
user가 user의 이름, 나이를 입력한다.
app이 user의 가입입을 입력한다.
--

이름: gamebit
나이: 25

이름: gamebit
나이: 25
가입일: 2022-12-27
*/