package ch07.ex04.case05.test;

import ch07.ex04.case05.dao.ScoreDao;
import ch07.ex04.case05.dao.ScoreDaoImpl;
import ch07.ex04.case05.domain.Score;

public class ScoreDaoTest {
	public static void main(String[] args) {	
//		테스트를위해 미리 준비해둔 데이터 fixture
		Score socore1 = new Score(100, 100, 100);
		Score socore2 = new Score(10, 10, 10);
		
		Score[] scores = new Score[2];
		ScoreDao scoreDao = new ScoreDaoImpl(scores);
		
		scoreDao.insertScore(socore1);
		scoreDao.insertScore(socore2);
		
		scores = scoreDao.selectScores();
		for(Score score: scores)System.out.println(score);
	}
}
