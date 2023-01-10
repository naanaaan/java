package ch08.ex04.case01;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class C04TryResource {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3};
//			try()안에 명령어들은 끝을 안내도 자동으로 끝이난다
		try(
			PrintWriter out1 = new PrintWriter(new FileWriter("c:/DEV/1.txt"));
			PrintWriter out2 = new PrintWriter(new FileWriter("c:/DEV/2.txt"));	
			){
				for(int i = 0; i < arr.length; i++) {
					out1.println("arr[" + i + "]" + arr[i]);
					out2.println("arr[" + i + "]" + arr[i]);
				}
//			catch두는 순서가 자식에서 부모 부모를 먼저두면 아래 자식이 실행안됨.
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("array error.");
		} catch(IOException e) {
			System.out.println("IO error.");
		}
		
		System.out.println("end.");
	}
}
