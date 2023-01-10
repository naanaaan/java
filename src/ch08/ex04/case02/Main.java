package ch08.ex04.case02;

public class Main {
	public static void main(String[] args) {
		String userId = "gambit";
		
		try {
			if(userId.length() > 3)
				throw new LengthException("문자 길이가 초과되었습니다.");//throw는 메소드내에서
		} catch(LengthException e) {
			e.printStackTrace(); //스택형태로 나옴
		}
		
		throw new NumberException("숫자가 아닙니다."); //Runtime으로 바꾸니까 try로 안묶어도됨
	}
}
// log 