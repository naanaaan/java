package ch05.home.ex03.case01;

import ch05.home.ex03.case01.Cat;

public class Main {
	public static void main(String[] args) {		
		Cat myCat = new Cat();
		
		myCat.setColor("검은");
		myCat.setNumber("한");
		myCat.setCatName("야코미");
		
		System.out.printf("%s 고양이 %s 마리를 주웠습니다.\n"
						+ "%s라고 이름 지었습니다.",
				myCat.getColor(), myCat.getNumber(), myCat.getCatName());
	}
}
/*
검은 고양이 한 마리를 주웠습니다.
야코미라고 이름을 지었습니다.
*/