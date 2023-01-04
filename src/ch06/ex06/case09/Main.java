package ch06.ex06.case09;

public class Main {
	public static void main(String[] args) {
		Console console = new Console();
		Browser browser = new Browser();
		Chrome chrome = new Chrome();
		
		console.out();
		browser.out();
		
		
		UI.in();
//		console.in(); 컴파일 에러
//		browser.in(); 컴파일 에러 정적메소드는 상속이 안됨
//		Console.in(); 컴파일 에러
//		Browser.in(); 컴파일 에러
		
		chrome.out();
//		chrome.in(); 컴파일 에러
//		Chrome.in(); 컴파일 에러
	}
}
