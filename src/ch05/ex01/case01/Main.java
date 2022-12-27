package ch05.ex01.case01;

public class Main {
	public static void main(String[] args) {
		int hour = 12;
		int minute = 35;
		int second = 30;
		System.out.printf("%d시 %d분 %d초\n", hour, minute, second);
		
		Time time =new Time();
		time.hour = 12;  //.은 연산자 이 주소를 가진 객체를 찾음
		time.minute = 35;
		time.second = 30;
		System.out.printf("%d시 %d분 %d초\n", time.hour, time.minute, time.second);
		
		Time time2 = new Time();
		time2.hour = 10;
		time2.minute = 30;
		time2.second = 27;
		System.out.printf("%d시 %d분 %d초\n", time2.hour, time2.minute, time2.second);
		
		System.out.println(time); //주소인데 해쉬코드임 자바는 주소노출 안함
		System.out.println(time2.toString()); //.toString()감춰져있음 주소를 문자값으로 리턴
	}
}
