package ch09.ex02;

public class Main {
	public static void main(String[] args) throws InterruptedException{
//		VM에게 sleep interrupt 등 요청만 할뿐 배정은 알아서 해서 순서가 살짝씩 매번 달라짐
		System.out.println(Thread.currentThread().getName() + ": start");
		
		Thread counter = new Thread(new Counter());
		counter.start();
		
//		isAlive 안자고 있는 지 확인하기
		int tries = 1;
		while(counter.isAlive()) {
//			살아있음 true 살아있음 양보할려고 코드작성
			if(tries <= 2) {
				counter.join(1000); //1000ms동안 main쓰레드가 counter쓰레드를 일안하고 지켜본다.
				System.out.println(Thread.currentThread().getName() + ": wait" + tries++);
			}else {
				System.out.println(Thread.currentThread().getName() + ": irritated.");
				counter.interrupt();// 일어났어 //InterruptedException
				counter.join(); //무한정기다리기
//				counter가 끝나고 main이 end됨
			}
		}
		System.out.println(Thread.currentThread().getName() + ": end");
	}
}
