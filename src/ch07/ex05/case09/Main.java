package ch07.ex05.case09;

public class Main {
	public static void main(String[] args) {
		C c = new C();
		String msg = "";
		if(c instanceof C) msg += "C ";
		if(c instanceof B) msg += "B ";
		if(c instanceof A) msg += "A ";
		if(c instanceof Object) msg += "Object";
		System.out.println(msg);
		
		B b = new B();
		msg = "";
		if(b instanceof C) msg += "C ";
		if(b instanceof B) msg += "B ";
		if(b instanceof A) msg += "A ";
		if(b instanceof Object) msg += "Object ";
		System.out.println(msg);
		
//		if(b instanceof F)컴파일에러
//		if(c instanceof F)
		
		F f = new F();
		msg = "";
//		if(f instanceof C)
		if(f instanceof A) msg += "A"; //B나 C는 Class이다
//		인터페이스는 앞에 객체가 뭔지 알바아님
//		그런다고 msg에 출력되는 건 아님 컴파일 에러만 안남
		System.out.println(msg);
	}
}
