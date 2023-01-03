package ch06.ex03.case03;

public class Duck extends Object {
// Object가 숨겨져 있다 결국 모든 클래스는 Object를 상속받음
//	즉 자바개발자는 Object의 기본 매서드를 알고있어야 한다.
	@Override
	public String toString() {
		return "오리";
	}

}