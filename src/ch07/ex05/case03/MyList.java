package ch07.ex05.case03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyList {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(1);

		System.out.println(list);

		for (int i : list)
			System.out.print(i + " ");
		System.out.println();

		System.out.println(list.get(0)); // get READ

		for (int i = 0; i < list.size(); i++) // size = length
			System.out.print(list.get(i) + " ");
		System.out.println();

		list.remove(1); // 2가 제거딤
		System.out.println(list);

		// 과제: list의 모든 원소를 삭제하라.
//		do {
//			list.remove(0);
//		}while(!(list.size() == 0));
//		System.out.println(list);
//		list.removeAll(list);//주어.removeAll(목적어) 주어목적어 같은거 삭제
		list = new ArrayList<>(Arrays.asList(1, 2, 3, 1));
//		Arrays.asList(1, 2, 3, 1) //asList를 단독으로 쓰면 remove못씀
		for (int i = list.size() - 1; i >= 0; i--) {
			list.remove(i);
		}
		System.out.println(list);
	}
}
