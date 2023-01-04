package practice.ch08.ex01;

public class Audio implements RemoteControl {
	private int volume;
	
	public Audio() {}
	
	public void turnOn() {
		System.out.println("오디오전원을 킵니다.");
	}
	public void turnOff() {
		System.out.println("오디오전원을 끕니다.");
	}
	public void setVolume(int volume) {
		this.volume = volume;
		System.out.printf("볼륨을 %d로 설정합니다.", volume);
	}
}
