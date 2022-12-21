package ch02.ex02;

public class C05String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// text block  """이렇게 "3개쓴것
//		Stirng comment = """
//				이 식당에 방문하길 잘햿네요.
//				"참 맛있다."
//				라는 말이 절로 나오네
//				""";
//		System.out.println(comment);
		
		String color = """
				red
				green
				blue
				""";
		System.out.println(color);
		
		color = """
				red  \s
				green\s
				blue \s
				""";
		System.out.println(color); //  스페이스값을 표현하기위해 \s를 사용한다
		
		String type = "int";
		String code = """
				public void print(""" + type + """
				 val)
				System.out.println(val);
				""";
		System.out.println(code);
		
		code = """
				<html>
					<body>
						<p>Hello, Java</p>
					</body>
				</html>   """;
		System.out.println("|" + code + "|");		
	}

}
