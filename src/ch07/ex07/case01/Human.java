package ch07.ex07.case01;

@FunctionalInterface
public interface Human {
	void say();
//	void tell(); FunctionalInterface에선 메서드 하나만
//	say매서드가 데이터이고 Human이 데이터 타입이 된다.
}
