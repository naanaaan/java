package ch05.ex03.case01;

public class Tv {
	private String color;
	private boolean power;
	private int channer;
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isPower() { //boolean은 get이 아니고 is가 관례
		return power;
	}

	public void setPower(boolean power) {
		this.power = power;
	}

	public int getChanner() {
		return channer;
	}

	public void setChanner(int channer) {
		this.channer = channer;
	}
}
