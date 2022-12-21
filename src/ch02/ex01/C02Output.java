package ch02.ex01;

public class C02Output {
	public static void main(String[] args) {
		int score = 100;
		System.out.println(100);  //()안에있는걸 parameter이라고 한다.100이 constant가 아니다 100이 할당된 공간을 의미한다.
		System.out.println(score);
		System.out.println(100+1); // expression 수식
		System.out.println(Math.random()); //method outclass에 마우스를 대면 데이터 타입이 나온다 이걸로 java api검색을 통해 어떤 타입인지 알고 정확한 검색이 가능하다.
		
		//println에 마우스를 데고 f2키를 눌러 아래 아이콘을 누르면 알고리즘이 어떤지 알 수 있따.
		
		
		System.out.print(200);//ln을 빼면 줄바꿈이 안된다.
		System.out.print(300);
		
		System.out.print('\n'); // ''로 가두면 char type ""문자열 \n은 엔터키를 의마한다 그런다고 \n이 줄바꿈기능이 아닌 print에 이값을 입력했을 떄의 알고리즘이 짜져있는 것이다.
		System.out.print(400);
		System.out.print('\n');
		
		System.out.printf("%b %c %d %f %s\n", true, 'a', 10, 1.15, "hello"); // %b bolean타입 prinf알고리즘에서 정한것
		//위 명령어 실행 시 각각 파라미터 빈공간을 \s로 표현가능
		//과제: 위 출력문에서 구분자로 /을 사용하라
		System.out.printf("%b/%c/%d/%f/%s\n", true, 'a', 10, 1.15, "hello");
		
		System.out.printf("%5b|%-5c|%5d|%5.2f|%5s\n", true, 'a', 10, 1.156, "hello"); //%5는 다섯자리 -는 왼쪽정렬 .2f는 소수점두자리까지  
		
		String name = "최한석";
		int age = 22;
		System.out.printf("%s %d", name, age);
		System.out.printf("\n%s은 %d살입니다.", name, age);
		System.out.println();
		System.out.println(name + "은 " + age + "살입니다."); // snippet , 문자더하기 concatenate 피연산자에 문자하나라Sd도 들어가면 붙이기이다.
	}
}
