package ch06.ex04.case01;

public class Animal {
	private String animalName;
	
//	public Animal() {}
//	상속은 맴버를 상속받음 즉 생성자 상속안받음
	public Animal(String animalName) {
		this.animalName = animalName;
	}
	
	public String getAinmalName() {
		return this.animalName;
	}
}
