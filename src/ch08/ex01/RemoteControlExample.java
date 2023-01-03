package ch08.ex01;

public class RemoteControlExample {
	public static void main(String[] args) {
//		익명 구현 클래스로 1회성 목적 컴파일된다면 RemoteControlExample$1.class가된다
		RemoteControl rc2 = new RemoteControl() {
			public void turnOn() {}
			public void turnOff() {}
			public void setVolume(int volume) {}
		};
//		추상메소드 사용.
		RemoteControl rc;
		rc = new Tv();
		rc.turnOn();
		rc.turnOff();
		rc.setVolume(2);
		
		rc = new Audio();
		rc.turnOn();
		rc.turnOff();
		rc.setVolume(3);
//		default 메소드
		rc.setMute(false);
//		static 메소드
		RemoteControl.changeBattery();
		
//		Myclass my = new Myclass();
	}
}
