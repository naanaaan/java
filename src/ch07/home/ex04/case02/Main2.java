package ch07.home.ex04.case02;

public class Main2 {
	public static void main(String[] args) {
		Card2[] cards = new Card2[5];
		
		for(int i = 0; i < cards.length; i++)
			cards[i] = new Card2(i);
		
		for(Card2 card: cards) System.out.print(card);
		System.out.println();
		
		for(int i = 0; i < 100; i++) {
			int idx = (int)(Math.random() * 4) + 1;
			
			Card2 tmp = cards[0];
			cards[0] = cards[idx];
			cards[idx] = tmp;
		}
		
		for(Card2 card: cards) System.out.print(card);
	}
}
