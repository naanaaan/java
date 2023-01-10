package ch08.ex04.case01;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class C03Try {
	public static void main(String[] args) {
		PrintWriter out = null;
		int[] arr = { 1, 2, 3 };
//      try와 catch는 베타적이며 finally는 무조건 실행됨
		try {
			out = new PrintWriter(new FileWriter("c:/DEV/a.txt"));
			for (int i : arr)
				out.println("arr[" + i + "]: " + arr[i]);
		} catch (ArrayIndexOutOfBoundsException e) {
			out.println("array error.");
		} catch (IOException e) {
			System.out.println("IO error.");
		} finally {
			if(out != null) out.close(); // close는 앞에 객체 없앰
//			out.close로 끝을 내야함 메모리 낭비떄문에 앱이 느려지고 나중에 쌓이면 멈추게 된다.
		}
		
		System.out.println("end. ");
	}
}
