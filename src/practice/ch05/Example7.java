package practice.ch05;

public class Example7 {
	public static void main(String[] args) {
		int[][] array = { { 95, 86 }, { 83, 92, 96 }, { 78, 83, 93, 87, 88 } };
		int sum = 0;
		double avg = 0.0;

		for (int i = 0; i < array.length; i++) {
			for (int l = 0; l < array[i].length; l++) {
				sum += array[i][l];
				
			}
//			 
		}
		
		System.out.println("sum: " + sum);
		System.out.println("avg: " + avg);
	}
}
