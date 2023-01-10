package ch09.ex03;

public class Main {
	public static void main(String[] args) {
//		멀티쓰레드란 쓰레드끼리 경쟁하는 것
//		run은 그저 가지고 있는 것 start는 run을 실행시키는 것.
		Counter counter = new Counter();
		new Player(counter).start();
		new Player(counter).start();
		new Player(counter).start();
	}
}
