package ch02.home.ex02;

import java.time.LocalDate;
import java.util.Scanner;

public class Reservation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year = 0;  //나의 문제점 변수 초기화를 안했따.
		int month = 0;
		int day = 0;

		System.out.println("공연 일자를 입력하세요.\n");
		System.out.print("년 : ");
		year = sc.nextInt();
		System.out.print("월 : ");
		month = sc.nextInt();
		System.out.print("일 : ");
		day = sc.nextInt();
		System.out.println();

		LocalDate reservation = LocalDate.of(year, month, day); //강사님은 변수 showDate로 하심

		System.out.println(reservation + " 공연을 예매했습니다.");
		day = day-3;
		reservation = LocalDate.of(year, month, day);
		System.out.println(reservation + " 까지 환불이 가능합니다.");
		//답은 day-3을 안하고 reservation.minusDays(3)을 한다.
		
		
	}
}

/*
 * 과제 : 예매하라. 환불은 공연일로부터 3일전까지 가능하다.
 * 
 * 공연 일자를 입력하세요. 년 : 2025 월 : 7 일 : 17
 * 
 * 2025-07-17 공연을 예매했습니다. 2025-07-14 까지 환불이 가능합니다.
 * 
 */