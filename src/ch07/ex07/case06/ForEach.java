package ch07.ex07.case06;

import java.util.ArrayList;
import java.util.List;

public class ForEach {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		for (int i = 1; i <= 3; i++)
			list.add(i);
		list.forEach(x -> System.out.print(x + " "));
		// forEach(Consumer<T>) 이게 람다이기떄문
		System.out.println();

		list.forEach(x -> {
			if (x % 2 == 0)
				System.out.println(x + " ");
		});
		// 과제: list에서 짝수들만을 출력하라.
	}
}