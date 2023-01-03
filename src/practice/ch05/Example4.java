package practice.ch05;

public class Example4 {
	public static void main(String[] args) {
		String[] oldArray = {"java", "array", "copy"};
		String[] newArray = new String[5];
		
		System.arraycopy(oldArray, 0, newArray, 0, oldArray.length);
		
		for(int i = 0; i < newArray.length; i++) {
			System.out.printf("newArray[%d]: %s\n", i, newArray[i]);
		}
		int[] scores = { 10, 20 ,30 ,40, 50};
		int sum = 0;
		for(int score : scores) {
			sum += score;
		}
		System.out.println(sum);
		}
	}

