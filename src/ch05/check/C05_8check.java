package ch05.check;

public class C05_8check {
	public static void main(String[] args){
		int[][] array = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		
		int sum = 0;
		double avg = 0.0;
		
		int legsum = 0;
//		여기부터 작성위치
		for(int a = 0; a < array.length; a++) {
			for(int b = 0; b < array[a].length; b++) {
				sum += array [a][b];
				System.out.println("a: " + a + "  " + "b: " + b);
			}
			legsum += array[a].length;
		}
		avg = 1.0*sum / legsum;
		
		
		
//
		System.out.println("sum: " + sum);
		System.out.println("avg: " + avg);
		
	}

}
