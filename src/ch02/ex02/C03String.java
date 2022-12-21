package ch02.ex02;

public class C03String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1;
		int b = 2;
		int c = 3;
		int sum = a + b + c;
		System.out.printf("sum: %d\n", sum);
		
		String sumStr = "" + sum; // String은 하나라도 문자이면 타입이 문자로 변함 //class타입 변수는 4byte
		System.out.println(sumStr);
	}

}
