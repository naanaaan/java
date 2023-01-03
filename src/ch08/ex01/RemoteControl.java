package ch08.ex01;

public interface RemoteControl {
	public static final int MAX_VOLUME = 10;
	public static final int MIN_VOLUME = 0;
	
	//추상메소드
	public abstract void turnOn();
	public abstract void turnOff();
	public abstract void setVolume(int volume);
	//default 메소드 -> 추가개념
	public default void setMute(boolean mute) {
		if(mute) {
			System.out.println("음소거 합니다.");
		}else {
			System.out.println("무음 해제합니다.");
		}
	}
	//정적 메소드 객체생성없이 컴파일과정에서 진행됨
	public static void changeBattery() {
		System.out.println("배터리를 교체합니다.");
	}
	
}
