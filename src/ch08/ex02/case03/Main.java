package ch08.ex02.case03;

public class Main {
	public static void main(String[] args) { 
		String name = Way.Left.name(); //코드네임가져옴
		int ordinal = Way.Left.ordinal(); //코드네임 벨류 가져옴
		//index라고 보면됨
		name = Way.Right.name();
		ordinal = Way.Right.ordinal();
		System.out.printf("%s %d\n", name, ordinal);
		
		Way[] ways = Way.values(); //값을 넣은거지 코드네임 가져온거 아님
		for(Way way: ways) System.out.print(way + " "); //출력은 코드네임
//		안에 요소들을 entry라고 한다.
		System.out.println();
		
		Way way = Way.valueOf("Left"); //String이라 맞게 입력
		System.out.println(way);
	}
}
