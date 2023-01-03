package ch06.ex04.case01;

public class Cat extends Animal{
	private int age;
	

	
	public Cat(String catName, int age) {
		super(catName);
//		this.animalName = catName;
		this.age = age;
	}
	
	public int getAGe() {
		return this.age;
	}
	
	@Override
	public String toString() {
		return String.format("%s %d", this.getAinmalName(), this.getAGe());
	}
}
