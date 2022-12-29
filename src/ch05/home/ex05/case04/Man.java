package ch05.home.ex05.case04;

public class Man {
	private String manName;
	private int age;
	private String birthday;

	public Man(String manName, int age, String birthday) {
		this.manName = manName;
		this.age = age;
		this.birthday = birthday;
	}

	public String getManName() {
		return manName;
	}

	public void setManName(String manName) {
		this.manName = manName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public void sit() {

	}

	public void introduce() {

	}

	public void waiting() {

	}

	public void sing() {

	}

	public void eat() {

	}

	public void run() {

	}

}
/*
 * 남자 객체만을 class로 디자인하라. --
 * 
 * 식당에서 한 남자가 다가와 앉습니다. 남자가 자기 소개를 합니다. 이름은 최한석, 나이는 33살, 생일은 2025-6-7 입니다.
 * 
 * 남자는 음식을 기다리는 동안, 노래를 부립니다. 음식이 나오자 맛있게 먹습니다. 다 먹더니, 계산 안 하고, 달려 나갑니다.
 */