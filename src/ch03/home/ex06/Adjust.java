package ch03.home.ex06;

import java.util.Scanner;

public class Adjust {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double x = 0;
		double remain = 0;
		
		System.out.print("x: ");
		x = sc.nextDouble();
		
		remain = x % 1;
		
		System.out.println(x - remain);
	}

}
/*
 * 과제: % 연산자를 이용해서, 실수값의 소수점 이하를 내림처리하라.
 * (casting), Math API를 사용 안 한다.
 * 실수값은 sc.nextDouble() 로 입력한다
 * 
 * --
 * 
 * 
 * x: 3.1492
 * 3.0
 * 
*/
