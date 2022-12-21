package ch02.ex02;

public class C01Int {
	public static void main(String[] args) {
		int x = 10; // decimal
		//int 총32비트 오른쪽 4개비트가 1010이다
		System.out.println(Integer.toBinaryString(x)); // 2진수로 표현한다
		
		x = 012; // octal 앞에 0은 8진수임을 알려주기 위해 붙인 것
		System.out.println(Integer.toBinaryString(x));
		
		x = 0xA; // hexa 16진수 0x를 넣으면 16진수라 인식
		System.out.println(Integer.toBinaryString(x));
		
		x = 0b1010; // 0b이진수인식
		System.out.println(Integer.toBinaryString(x));
		
		x = 1_234_567;  // _ 는 ,을 의미
		
		System.out.println(x + 1);
		
		double y = 1e1;
		System.out.println(y);
		
 	}
}
