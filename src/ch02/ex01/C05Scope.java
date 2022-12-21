package ch02.ex01;

public class C05Scope {
	public static void main(String[] args) {
		int i = 0; //자신의 scope이 끝날때까지 적용 
//		int i = 0;
		int j = 0;
		{
//			int i = 0; 안에 있는 i도 중복
			int x = 0;
			int y = 0;
		}
		int x = 0; // 저 중가로범위안에서 적용이기 대문
//		위는 local 변수인데 vm관점으로 볼때 stack이라는 곳에 저장이 된다.
//		3
//		2
//		1 이런식으로 없어질때는 위에서부터 없어지고 쌓이는 건 아래부터
//		run버튼 누르면 javaw.exe(console, vm) C05Scope(class) 이렇게 실행이 되며 이걸 loading이라고 한당
//		loading이 끝나게 되면 javaw.exe가 main매서드를 콜한다.
	}
}
