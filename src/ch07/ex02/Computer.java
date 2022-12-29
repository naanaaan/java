package ch07.ex02;

public class Computer extends Calculator {
//	부모Class의 매소드를 수정한 것이다.
//	여기서 중요한것이 부모의 접근제어자가 public이면 자식은 private로 안된다
//	즉 부모보다 더 좁은 접근제어자는 사용안되며 반대로 큰 접근제어자가능
//	ex) 부모 default 자식 public 가
	
	@Override
	double areaCircle(double r) {
		System.out.println("Computer 객체의 areaCircle() 실행");
		return Math.PI * r *r;
	}
}
