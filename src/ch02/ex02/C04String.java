package ch02.ex02;

public class C04String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s =  "|" + " a happy ".trim() + "|";  //|는 스페이스 있다고 표시하기위해서 쓴거임 큰의미없음.trim()은
//		스페이스바를 유저가 실수로 쓰는 걸 다듬기 위해서 a happy양 옆을 다듬는다
		s = s.concat("dog"); // 주어에 목적어를 붙이는 역할을 한다 원문에다 파라미터 붙임
		s = s.substring(2);  // 원문의 왼쪽부터 파라미터값만큼 없애는 역할을 한다.  // 문자열을 뜯어냄
		System.out.println(s);
		
		s = "hello";
		System.out.printf("%c\n", s.charAt(1));  //문자단위로 뜯어냄
		
		
		int i = "apple".codePointAt(1);  // p의 유니코드를 알려준다
		System.out.println(i);
		
		i = "a".hashCode();  //이것도 유니코드
		i = "b".hashCode();
		i = "b".compareTo("a");
		i = "a".compareTo("b");
		i = "A".compareTo("a");// 앞뒤간의 차이를 구한다
		i = "A".compareToIgnoreCase("a");  // 0나옴 대소문자 무시함
		i = s.indexOf("l");  //첫번째 l의 인덱스를 아렬준다 2가나옴
		i = s.lastIndexOf("l"); //마지막 l의 인덱스를 알려준다,
		i = s.length();   // 문자길이를 알려준다
		System.out.println(i);
		
		s = "develop";
		boolean b = s.startsWith("de");  //de로 시작하는 지알고 싶다 
		System.out.println(b);
		b = s.endsWith("lop"); //  끝이 lop인지 알고싶다
		b = s.equals("develop");  //안에 파라미터와 같은지 알고싶다
		b = s.equals("Develop");  // false나온당
		b = s.equalsIgnoreCase("Develop"); //이건 트루나온다 대문자무시하고 값만 확인할때
		b = "".isEmpty();   // 빈칸
		b = s.matches("[a-zA-Z]*");  // []안에 범위값 확인할때
		b = s.matches("[0-9]");   // 
		System.out.println(b);
	}
			

}
