package ch08.ex05;

import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Logger;

public class C03FileLogger {
	private Logger logger;
	
	public C03FileLogger() {
		this.logger = Logger.getLogger(this.getClass().getName()); //getName패키지명자동으로 뽑음 geClass는 클래스뽑음
	}
	
	public void log() throws Exception {
		Handler handler = new FileHandler("c:/DEV/ch08.ex05.xml"); //ch08.ex05는이름
		logger.addHandler(handler); //에러메세지를 handler에 저장
		
//		메모리에 출력인것 객체는 메모리임 heap에서 메모리먹으니
		logger.info("로깅을 시작합니다.");
		logger.severe("예외가 발생했습니다.");
		logger.info("로깅을 마칩니다.");
		
		handler.flush(); // 계속 파일 만들면 비용비쌈 그래서 한방에 이걸로 보냄
		handler.close();
	}
	
	public static void main(String[] args)throws Exception { //main이 떠넘기는 Exception은 VM이 받는다.
		new C03FileLogger().log();
	}
}
