package ch04.ex02;

public class C04Switch {
	public static void main(String[] args) {
		String comment = "ab";
		
		String msg = switch(comment.length()) {
		case 1 -> "too short.";
		case 2 -> "good.";
		default -> "too long.";
		};
		
		System.out.println(msg + '\n');
		
		
		msg = switch(comment.length()) {
		case 1 -> "too short";
		case 11 -> {yield "I don't know.";}//yield 실행문에서 return값 출력
		case 2 -> {
			String message = comment + " is good.";
			yield message;
		}
		default -> {yield comment + " is too long.";}
		};
		System.out.println(msg);
		
//		yield keyword X, 제한자이다  restricted identifier 0
		int yield = 1; //변수 쓸수 있음
		System.out.println(yield);
//		int switch = 1; //컴파일 에러 키워드라는 증거
		
	}
}
