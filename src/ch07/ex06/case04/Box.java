package ch07.ex06.case04;

public class Box {
	public <T> T getLastVal(T[] arr) { //<T>메서드 내에서만 효과
		return arr[arr.length - 1];
	}
}
