package com.my.hr.test;

import java.time.LocalDate;
import java.util.Scanner;

public class Test {
	private static LocalDate local;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		int month = sc.nextInt();
		int day = sc.nextInt();
		local = LocalDate.of(year, month, day);
		System.out.println(local);
		
	}
}
