package ch03.ex04;

public class C01Arith {
	public static void main(String[] args) {
		byte a = 3;
		byte b = 2;
		byte c = (byte) (a + b);  //a + b 가 인트타입이기 때문이다 인트보다 작은크기는
//		자동으로 인트로 타입변환되어 byte로 강제타입변환을 시켜줘야한다.
		
//		c = c +1; 컴파일에러
		c++;
		System.out.println(c);
		
		double d = a / (double)b;  // a / b 인트타입이라 묶어서 변환이 아닌 둘중 하나만
//		타입변환시키면됨
		System.out.println(d);
		d = 1.0 * a / b;
		System.out.println(d);
		
		
		d = (double)(a / b);
		System.out.println(d);
		d = a / b * 1.0;
		System.out.println(d);
		
	}
}
