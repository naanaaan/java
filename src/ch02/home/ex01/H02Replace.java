package ch02.home.ex01;

import java.util.Scanner;

public class H02Replace {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(); 
		int b = sc.nextInt();
		int temp; // business logic이라고 한다
		
		System.out.println("a = " + a); // presentation logic, IO(Input/Output)
		System.out.println("b = " + b);
		temp = b;
		b = a;
		a = temp;
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
	}
}
//과제 : H01을 확작성 있게 고도화하라. > soft coding이다 hard coding은 고정된 값
