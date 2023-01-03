package ch08.ex01;

public class Myclass {
//	필드
	RemoteControl rc = new Tv();
	
//	생성자
	Myclass(RemoteControl rc){
		this.rc = rc;
	}
	
//	메소드
	void methodA() {
		RemoteControl rc = new Audio();
	}
	
	void methodB(RemoteControl rc) {
		
	}
}
