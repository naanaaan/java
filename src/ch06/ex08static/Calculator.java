package ch06.ex08static;

public class Calculator {
	static double pi = 3.14159;
	static int a; //정적필드는 위 pi처럼 선언과 동시에 초기화하는게 일방적 아닐떄 정적블록사용
	
	static {  //이것이 정적 블록이며 인스턴스 맴버는 못오며 쓰기위해선 블록안에 객체생성을 해야한다.
//				this도 못씀
		
	}
	static int plus(int x, int y) {
		return x + y;
	}
	
	static int minus(int x, int y) {
		return x -y;
	}
}
