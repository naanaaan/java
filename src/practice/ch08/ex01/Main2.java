package practice.ch08.ex01;

public class Main2 {
	public static void main(String[] args) {
		RemoteControl rc = null;
		rc = new Tv();
		
		rc.turnOn();
		rc.turnOff();
		
		rc.setMute(false); // default 메소드
		
//		rc.searchTv(); 자동타입변환에서는 Tv클래스자체 메소드못씀
		
		Tv tv = (Tv)rc;
		tv.searchTv();
//		강제 타입변환이다 .
		
	}
}
