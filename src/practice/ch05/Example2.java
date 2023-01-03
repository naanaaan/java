package practice.ch05;

public class Example2 {
	public static void main(String[]args) {
		int[] scores = { 83, 90, 87 };
		double avg = 0;
		
		int sum = 0;
		for(int i = 0; i < 3 ; i++) {
			sum += scores[i];
		}
		System.out.println("점수의 총합: " + sum);
		
		avg = 1.0*sum / 3;
		
		System.out.println("점수의 평균: " + avg);
		
//		=-------------------
		int[] scores2 = null;
//		scores2 = {10, 20, 30}; 컴파일에러 먼저 선언을 했으면 다음과 같이
		scores2 = new int[] {10 ,20 ,30};
//		--------------------------------------
		int[] scores3 = null;
		scores3 = new int[5];
		scores3[0] = 10;
		scores3[1] = 20;
		System.out.println(scores3.length);
		scores3[2] = 30;
		
		int sum3 = 0;
		for(int i = 0; i < scores.length ; i++) {
			sum3 += scores[i];
		}
		
		System.out.println("scores3총합: " + sum3);
		
		
	}
}
