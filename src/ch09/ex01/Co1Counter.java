package ch09.ex01;

public class Co1Counter {
	public static void main(String[] args) {
		System.out.println("main start.");
		
		Thread thread1 = new Thread(() -> {
			for(int i = 0; i < 10; i++)
				System.out.print(i + " ");
		});
		
		Thread thread2 = new Thread(() -> {
			for(char c = 'a'; c <= 'z'; c++)
				System.out.print(c + " ");
		});
//		start해야 작동됨 그전까진 그냥 만들어만 둔거
		thread1.start();
		thread2.start(); 
//		여기서 main, thread1, thread2가 각각 병렬처리돼서 돌아간다.
		System.out.println("main end. ");
		//main보다 늦게시작하고 늦게 끝남 main은 금방끝나니까
		//같이 작업됨 thread는 산수해야해서 오래걸림 그래서 main이 먼저 끝남.
		
	}
}
