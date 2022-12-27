package ch05.ex01.case03;

public class Main {
	public static void main(String[] args) {
//		User user = new User();
		//user.userName =    // userName 맴버변수가 private이기 떄문이다
		
		User user = new User();
		user.setUserName("최한석"); //(user, "최한석") user숨겨져있음
		user.setAge(12);
		
		user.setUserName("한아름");
		user.setAge(43);
		System.out.printf("%s, %d\n", user.getUserName(), user.getAge());
	}
}
