package ch09.ex01;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class C02Executor {
	public static void main(String[] args) {
		Runnable r1 = () -> {
			for(int i = 0; i < 10; i++)
				System.out.print(i + " ");
		};
		
		Runnable r2 = () -> {
			for(char c = 'a'; c <= 'z'; c++)
				System.out.print(c + " ");
		};
		
		Executor executor = Executors.newCachedThreadPool()	; //새로운 쓰레드풀을 만든다.
		executor.execute(r1); //쓰레드로서 작동시켜준다.
		executor.execute(r2);
	}
}
