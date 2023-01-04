package practice.ch08.ex01;

public class Tv implements RemoteControl, Searchable {
	private int volume;
	private boolean mute;
	
	public void turnOn() {
		System.out.println("티비전원을 킵니다.");
	}
	public void turnOff() {
		System.out.println("티비전원을 끕니다.");
	}
	public void setVolume(int volume) {
		this.volume = volume;
		System.out.printf("볼륨을 %d로 설정합니다.", volume);
	}
	public void search(String url) {
		System.out.println(url + "을 검색합니다.");
	}
	
	@Override
	public void setMute(boolean mute) {
		this.mute = mute;	
		if(mute) {
			System.out.println("tv를 음소거");
		}else {
			System.out.println("tv음소거해제");
		}
	}
	
	public void searchTv() {
		System.out.println("TV로검색");
	}
}
