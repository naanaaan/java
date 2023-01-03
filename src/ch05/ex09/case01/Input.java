package ch05.ex09.case01;

import ch05.ex06.case02.Console;

public class Input {
	private static int s;
	private int i;
	
	static {
		Input.s = 1;
		Console.info("static{}");
	}
	
	{
		this.i = 1;
		Input.s = 1;
		Console.info("{}");
	}
	 
	{Console.info("{}2");}  //굳이 2개를 쓸필요가 없음
	
	public Input() {
		Console.info("Input{}");
	}
	
	public Input(int i) {
		
	}
}
