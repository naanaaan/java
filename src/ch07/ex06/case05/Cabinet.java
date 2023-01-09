package ch07.ex06.case05;

public class Cabinet<T extends A> { //A이하
	public T getLstVal(T[] arr) {
		return arr[arr.length - 1];
	}
	
	public <S extends C> S getFinalVal(S[] arr) {
		return arr[arr.length - 1];
	}
}
