package ch05.home.ex05.case06;

public class Man {
	private String manName;
	private Phone phone;
	
	public void setManName(String manName) {
		this.manName = manName;
	}

	public Phone buy(Phone phone) {
		return phone;
	}
	
	
	
	public void message(){
		phone.message();
	}
	
	public void call(){
		phone.call();
	}
	
	public void game() {
		phone.game();
	}
}
