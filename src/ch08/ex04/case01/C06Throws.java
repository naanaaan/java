package ch08.ex04.case01;

public class C06Throws {
	/*
	public void first() {  //2
		this.second();
	}
	
	public void second() { //3
		this.third();
	}
	
	public void third() { //4
		int i = 3 / 0 ;
	}  
	*/
	
	public void first() {  
		this.second();
	}
	
	public void second() {//third에서 throws를 써서 강제로 try
		try {
		this.third();
		} catch(Exception e) {
			System.out.println("second()");
		}
	}
	
	public void third()  throws Exception { //선언할때 try써라!
		int i = 3 / 0 ;
	}  
	
	public static void main(String[] args) {  //1
		new C06Throws().first();
		System.out.println("end.");
	}
}
