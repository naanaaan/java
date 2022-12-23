package ch04.ex02;

public class C03Switch {
	public static void main(String[] args) {
		int day = 4;
		
		String dayName = switch(day) {
		case 1 -> "sunday"; //실행문을 쓰면안되고 return값을쓴다
		case 2 -> "monday";
		case 3 -> "tuesday";
		case 4 -> "wednesday";
		case 5 -> "thursday";
		case 6 -> "friday";
		case 7 -> "saturday";
		default -> "none"; //디폴트필수
		}; // ;해줘야함
		
		System.out.println(dayName);
	}
}
