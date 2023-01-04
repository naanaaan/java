package practice.ch08.ex01;

public class Main {
	public static void main(String[] args) {
		Tv tv = new Tv();
//		Audio audio = new Audio();
//		
//		tv.turnOn();
//		tv.setVolume(2);
//		tv.setMute(true);
//		tv.setMute(false);
//		RemoteControl.changeBettery();
//		tv.turnOff();
		
		RemoteControl rc;
		rc = new Tv();
		rc = new Audio();
		rc.turnOn();
		rc.setVolume(4);
		rc.setMute(true);
		RemoteControl.changeBettery();
		rc.turnOff();
		
		RemoteControl rc2 = new RemoteControl() {
			public void turnOn() {}
			public void turnOff() {}
			public void setVolume(int volume) {}
		};
	}
}
