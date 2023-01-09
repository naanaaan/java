package ch08.ex01;

@Universal
@Type(name = "class", value = 1)
public class Myclass {
	@Field(1)
	@Universal // 기본 attributName이 value라서 생략가능
	private String myName;

	@Constructor
	public Myclass() {
	}

	@Method
	public void play(@Param String userName, @Param int age) {
		@Local
		int i = 0;
	}
}
