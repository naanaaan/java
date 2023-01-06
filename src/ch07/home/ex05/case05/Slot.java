package ch07.home.ex05.case05;

import java.util.ArrayList;
import java.util.List;

public class Slot {
	private List<Ball> balls;
	
	public Slot() {
		balls = new ArrayList<>();
		
		for(int i = 1; i <= 45; i++)
			balls.add(new Ball(i));
	}
	
	public Ball chuck() {
		int i = (int)(Math.random() * balls.size());
		return balls.remove(i);
	}
//	강사님 방법
	
//	int i = 0;
//	Ball ball = null;
//	
//	do {
//		i = (int)(Math.random() * 45);
//		ball = balls[i];
//		balls[i] = null;
//	}while(ball == null);
//	
//	return ball;
//	}
	
	
	
}
