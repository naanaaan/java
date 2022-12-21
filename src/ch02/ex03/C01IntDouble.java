package ch02.ex03;

public class C01IntDouble {
	public static void main(String[] args) {
		int i = 1;
		double d = 0.0;
		
		d = i;	//promotion
		System.out.printf("%f %d\n", d, i);// i변수 값은 바뀌지 않는다
		
		d = (double)i;
		
		System.out.printf("%f %d\n", d, i); //d의 값은 캐스팅 연산자가 return한 값이다.
		
		i = (int)d; // casting
		System.out.printf("%f %d", d, i);
	}
	
}
