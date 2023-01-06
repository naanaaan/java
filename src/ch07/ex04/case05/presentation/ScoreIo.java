package ch07.ex04.case05.presentation;

import ch07.ex04.case05.domain.Score;
import ch07.ex04.case05.service.ScoreService;
// 과제: 5명의 국 영 수 점수를 user가 입력토록 하라.
// interface Cosole을 만든다.

public class ScoreIo {
	private ScoreService scoreService;

	public ScoreIo(ScoreService scoreService) {
		this.scoreService = scoreService;
	}
	
	public void play() {
		Score[] scores = new Score[5];
		for (int i = 0; i < scores.length; i++) {
			scoreService.addScore(
					new Score((i + 1)* 10, (i + 1) * 10, (i + 1) * 10));
			
			scores = scoreService.getScores();
			for(Score score: scores)
				System.out.println(score);
		}
	}
}
