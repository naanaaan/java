package ch06.ex10final;

public class PersonExample {
	public static void main(String[] args) {
		
		Person p1 = new Person("1234-1234", "가나"); // ssn은 final이기때문에 처음에 꼭 입력값을 주어야함
		
//		p1.ssn = "1234";  컴파일 에러 final 이기때문에
		
		p1.name = "가나다라";
//		name은 수정가능
	}
}
