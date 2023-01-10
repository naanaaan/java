package ch09.ex02;

public class Counter implements Runnable {
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + ": start."); //vm에 현재작동중인 쓰레드 리턴
		
		for(char c = 'a'; c <= 'f'; c++) {
			System.out.println(Thread.currentThread().getName() +":" +  c);
			try {
				System.out.println(Thread.currentThread().getName() + ": sleep.");
				Thread.sleep(1000);//ms단위이며 sleep이란 다른쓰레드가 일하는동안 멈추는 시간을 sleep이라 표현
			} catch(InterruptedException e) {
//				InterruptedException 잘떄 발생?
//				sleep깨우는걸 Notify라고 한다.
				System.out.println(Thread.currentThread().getName() + ": interrupted");
			}
		}
		
		System.out.println(Thread.currentThread().getName() + ": end");
	}
	
	
}
