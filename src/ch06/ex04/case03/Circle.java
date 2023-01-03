package ch06.ex04.case03;

public class Circle extends Point { // isa관계가 아니다 그래서 나쁜 코드
	private int r;
	
	public Circle(int x, int y, int r) {
		super(x, y);
		this.r = r;
	}
	
	@Override
	public String toString() {
		return String.format("(%d, %d), %d", this.getX(), this.getY(), r);
	}
}
