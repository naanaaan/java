package ch07.ex01;

public class DmbCellPhoneExample {
	public static void main(String[] args) {
		DmbCellPhone dmb = new DmbCellPhone("삼성", "검정", 7);
		
		System.out.println("모델: " + dmb.model);
		System.out.println("색상: " + dmb.color);
		
		dmb.powerOn();
		dmb.turnOnDmb();
		dmb.turnOffDmb();
		dmb.powerOff();
		
	}
}
