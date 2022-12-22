package ch03.home;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int inputa = 0;
		int inputb = 0;
		
		System.out.print("a: ");
		inputa = sc.nextInt();
		
		System.out.print("b: ");
		inputb = sc.nextInt();
		
		int sum = inputa + inputb;
		
		System.out.printf("%d + %d = %d", inputa, inputb, sum);
	}

}
/*
 * 과제 : 두 자연수를 입력받아, 그 합계를 출력하라
 * 
 *  
 *  a: 1
 *  b: 2
 *  1 + 2 = 3
 *
*/