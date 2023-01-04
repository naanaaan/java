package ch06.ex05.case02;

public interface Main {
	public static void main(String[] args) {
		Dog dog = new Dog(1);
		
		dog.shout();
		
		System.out.println(dog.getAge()); //부모Class의 맴버변수가 뜸
	}
}
