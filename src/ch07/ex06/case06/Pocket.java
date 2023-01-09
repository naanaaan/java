package ch07.ex06.case06;

import java.util.List;

public class Pocket {
	{
		int i = 1 + 2 ;
		double d = 1.0 + 2.0;
//		new Number(1) + new Number(2);
		
	}
	
	// unbounded wildcard
	public void printList(List<?> list) {
		System.out.println(list);//?와일드카드
//		사용할떄조차도 사용하지 않겠다라는 의미이다.
	}
//	제네릭은 디자인할때 쓰고 use할때는 와이들카드를 쓴다.
	// upper bounded wildcard
	public double add(List<? extends Number> list) {
		double sum = 0;
		for(Number n: list) sum += n.doubleValue();
		return sum;
	}
}
