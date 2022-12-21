package ch02.ex04;

public class C02overflow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		byte b = 128;  overflow
		byte b = 127;
//		b = b + 1;
		b++;
		b++;  //-127
		System.out.println(b);
	}

}
