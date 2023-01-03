package practice.ch05;

public class Example6 {
	public static void main(String[] args) {
		int max = 0;
		int[] array = { 1, 5, 3, 8, 2 };
		for (int i = 1; i < array.length; i++) {
			if(max > array[i]) max = array[i-1];
			else max = array[i];	
			
		}

		System.out.println("max: " + max);
	}

}
