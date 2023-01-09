package practice.Etc;

public class Boxing {
	public static void main(String[] args) {
		Box<Integer> box1 = Util.<Integer>boxing(100);
		int intValue = box1.getT();
		
		System.out.println(intValue);
	}
}
