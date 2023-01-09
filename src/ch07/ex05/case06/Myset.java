package ch07.ex05.case06;

import java.util.HashSet;
import java.util.Set;

public class Myset {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(1);
		
		System.out.println(set); //중복1이 없음 Key라는 데이터가 
//		따로 없어 value만으로 구분하여 중복된 값 생성 불가
	}
}
