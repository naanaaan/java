package ch10.ex02;

public class Try {
	public static void main(String[] args) {
		String data1 = null;
		String data2 = "a";
//		try {
//			data1 = args[0];
//			data2 = args[1];
//		} catch(ArrayIndexOutOfBoundsException e ) {
//			System.out.println("실행 매가값의 수가 부족합니다.");
//			System.out.println("[실행 방법]");
//			System.out.println("java Try num1 num2");
//			return;
//		}
		
		try {
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
		} catch(NumberFormatException e) {
			System.out.println("숫자로 변환할 수 없습니다.");
		} finally {
			System.out.println("다시 실행하세요.");
			
		}
	}
}
