package practice.ch05;

public class Example3 {
	public static void main(String[] args) {
//		int[][] scores = new int[2][3];
//		scores[0][0] = 90;
//		scores[0][1] = 99;
////		아래는 계단식이 된다.
//		int[][] scores2 = new int[2][];
//		scores2[0] = new int[2];
//		scores2[1] = new int[3];
//		
//		scores2[0][0] = 10;
		
//		scores2.length 2
//		scores2[0].length 2
//		scores2[1].length 3
		
//		int[][] scores = {{10,20}, {30,40}};
		
		int[][] mathScores = new int[2][3];
		for(int i = 0; i < mathScores.length ; i++) {
			for(int l = 0; l < mathScores[i].length; l++) {
				System.out.printf("mathScores[%d][%d]: %d\n", i, l, mathScores[i][l]);
			}
		}
		System.out.println();
		
		int[][] engScores = new int[2][];
		engScores[0] = new int[2];
		engScores[1] = new int[3];
		for(int i = 0; i < engScores.length ; i++) {
			for(int l = 0; l < engScores[i].length; l++) {
				System.out.printf("engScores[%d][%d]: %d\n", i, l, engScores[i][l]);
			}
		}
		System.out.println();
		
		int[][] javaScores = {{20, 30},{40, 50}};
		for(int i = 0; i < javaScores.length ; i++) {
			for(int l = 0; l < javaScores[i].length; l++) {
				System.out.printf("javaScores[%d][%d]: %d\n", i, l, javaScores[i][l]);
			}
		}
		
	}
}
