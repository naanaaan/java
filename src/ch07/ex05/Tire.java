package ch07.ex05;

public class Tire {
	public int maxRotation; //최대회전수
	public int accumulatedRotation; //누적회전수
	public String location; 	//타이어의 위치
	
	//생성자
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
	//매소드
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + " 타이어수명 " + (maxRotation-accumulatedRotation) + "회");
			return true;
		}else {
			System.out.println("***" + location + "타이어 펑크 ***");
			return false;
		}
	}
}
