package ch09.ex03;

public class Counter {
	private int val;
	
	public synchronized void increase() { //synchronized lock걸기 화장실 줄서기 느낌 자리는 한자리인데 경쟁함
		val++;
	}
	
	public synchronized void decrease() {
		val--;
	}
	
	public void print() {
		System.out.print(val + " ");
	}
}
