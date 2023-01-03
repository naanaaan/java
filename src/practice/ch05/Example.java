package practice.ch05;

public class Example {
	public static void main(String[] args) {
		String str1 = "name";
		String str2 = "name";
		boolean result = false;
		
		result = str1 == str2;
		System.out.println(result);
		
		String str3 = new String("name");
	
		result = str1 == str3;
		
		System.out.println(result);
		
		result = str1.equals(str3);
		
		System.out.println(result);
	}
}
