package ch06.home.ex04.case03;

public class Circle{ 
	private Point point;
	private int r;

	public Circle(Point point, int r) {
		this.point = point;	
		this.r = r;
	}
	
	public int getR() {
		return this.r;
	}
	
	@Override
	public String toString() {
		return String.format("%s, %d", this.point,  this.r);
	}
}
