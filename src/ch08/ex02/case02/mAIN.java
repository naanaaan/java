package ch08.ex02.case02;

public class mAIN {
	public static void main(String[] args) {
		Way way = Way.LEFT;
		String direction = "";
		
		direction = switch(way) {
		//case앞에 way.생략가능
		case LEFT -> "왼쪽";
		case RIGHT -> "오른쪽";
		default -> "";
		};
		
		
		System.out.println(direction);
	}
}
