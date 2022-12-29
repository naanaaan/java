package ch05.ex04.case1;

public class Main {
	public static void main(String[] args) {
		System.out.printf("%d, %d", Card.width, Card.height);
		
		Card.width = 10;
		Card.height = 20;
		
//		Card.kind;
//		Card.number 존재안함 이유는 객체생성전에 static은 바이트코드에서 생성되지만
//		요것들은 객체가 생성되고 생성되기때문ㅇ
//		static 변수를 잘안써야하는 이유는 공유되기때문에 오염된다.
//		a,b,c객체가 있고 각자 static을 쓴다하면 누군가 멋대로 건들어버리면 데이터가 변질되어 버릴 수 있기 떄문이다.
//		쓸떄는 주소를 예로 들 수 있다 유저주소 판매원 고객센터 이렇게 각자 변수를 쓴다면
//		주소가바꼈을때 무결성이깨져 서로 다른 주소를 갖게 된다
//		즉 적절한 static사용이 필요
		
		Card card1 = new Card();
		Card card2 = new Card();
		
		card1.kind = "heart";
		card1.number = 7;
		
		card2.kind =  "spade";
		card2.number = 4;
		
		System.out.printf("%s %d %d %d\n", card1.kind, card1.number, card1.width, card1.height);
		System.out.printf("%s %d %d %d\n", card1.kind, card1.number, Card.width, Card.height);
		//아래것이 올바른 코드 why 위에처럼 쓰면 static 필드값인지 인스턴스의 변수값인지를 구분 못하기떄문이다.
		System.out.printf("%s %d %d %d\n", card2.kind, card2.number, Card.width, Card.height);
		
	}
}
