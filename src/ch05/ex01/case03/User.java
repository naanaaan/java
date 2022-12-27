package ch05.ex01.case03;

public class User {
	private String userName;
	private int age;
	// write할땐 ruturn값 없으므로 void
	// 데이터 쓰기는 set으로 시작 그리고 변수명 쓰기는 저장 //getter
	public void setUserName( User this,String userName) { //메모리 공간차지 x 그냥 코드임
		this.userName = userName; //this는 변수이며 타입은 User이다.
//			User this선언이 숨겨져있음
	}
	public void setAge(int age) { //set으로 시작하는메소드를 setter
		this.age = age;
	}
	public String getUserName() { //get은 읽기
		return this.userName;
	}
	public int getAge() {
		return this.age;
	} //accessor
	
	}	

