package ch08.ex01;

public class Audio implements RemoteControl {
	
private int volume;
// default매서드를 쓰기위해서 mute추가
private boolean mute;
	
//	turon추상메소드의 실체 메소드
	public void turnOn(){
		System.out.println("audio를 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}
	
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}else if(volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}else this.volume = volume;
		System.out.println("현재 볼륨: " + volume);
	}
	
	@Override
	public void setMute(boolean mute) {
		this.mute = mute;
		if(mute) {
			System.out.println("Audio 무음 처리합니다.");
		}else {
			System.out.println("Audio 무음 해제합니다.");
		}
	}
}
