package ch10.ex01;

public class ArrayIndexOutOfBoundsException {
	public static void main(String[] args) {
		String[] arr = new String[3];
		arr[0] = "0";
		arr[1] = "1";
		arr[2] = "2";
		arr[3] = "3";
//		크기가3인데 arr인덱스 3은 업슨ㄴ공간이므로 에러
		System.out.println(arr[3]);
	}
}
