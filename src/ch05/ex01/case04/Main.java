package ch05.ex01.case04;

public class Main {
	public static void main(String[] args) {
		User user = new User();
		user.setuserName("최한석");
		
		System.out.println(user.getuserName());
		
		user.setuserName("한아름");
		System.out.println(user.getuserName());
		
	}
}

//integrity 무결성 참된 데이터
