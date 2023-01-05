package ch07.home.ex04.case02;

public class Card2 {
	private int cardNum;
	
	public Card2(int cardNum) {
		this.cardNum = cardNum;
	}
	
	@Override
	public String toString() {
		return this.cardNum + " ";
	}
}
