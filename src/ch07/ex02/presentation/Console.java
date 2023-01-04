package ch07.ex02.presentation;

public interface Console {
	static void info(Object obj) { //어떤 타입이든 쓸수있음
		System.out.println(obj);
	}
}
