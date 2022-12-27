package ch05.ex01.case04;

public class User {
	private String userName;
	
	public void setuserName(String userName) {
		char familyName = userName.charAt(0);
		
		if(familyName == '최')
			this.userName = userName;
		else this.userName = "누구세요?";
		
	}
	
	public String getuserName() {
		return this.userName;
	}
}
