package ch05.home.ex05.case06;

public class Person {
	private String personName;
	private Phone2 phone;
	
	public void message() {
		phone.message();
	}
	
	public void call() {
		phone.call();
	}
	
	public void game() {
		phone.playGame();
	}
	
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	
	public void setPhone(Phone2 phone) {
		this.phone = phone;
	}
}
