package ch06.home.ex03.case02;

import ch05.home.ex06.case02.Console;

public class Actor extends Performer {
	@Override			
	public void perform(){
		Console.info("연기하다.\n");
	}
}
