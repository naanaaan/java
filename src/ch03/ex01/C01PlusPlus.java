package ch03.ex01;

public class C01PlusPlus {
	public static void main(String[] args) {
		int i = 0;
		++i;
		System.out.println(i);
		i++;
		System.out.println(i);
		
		i = 0;
		int j = ++i;
		System.out.printf("i: %d, j: %d\n", i, j);
		
		i = 0;
		j = i++;  // 단항연산자가 제일 첫 우선이기때문에 j = 0이되고 i가 ++이 된다.
		System.out.printf("i: %d, j: %d\n", i, j);
		
		
	}
}
