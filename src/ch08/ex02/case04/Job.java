package ch08.ex02.case04;

public enum Job {
	EXIT, LIST, ADD, FIX, DEL;
	
//	오버로딩
	public static final Job valueOf(int ordinal) {
		return values()[ordinal];
	}
}
