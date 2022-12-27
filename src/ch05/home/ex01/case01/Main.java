package ch05.home.ex01.case01;

public class Main {
	public static void main(String[] args) {
		Flower flower1 = new Flower(); // name id date number는 그 자체로 쓰지말자
		Flower flower2 = new Flower();
		
		flower1.flowerName = "창포꽃";
		flower1.calysLength = 7;
		flower1.petalLength = 2;
		
		flower2.flowerName = "코스모스";
		flower2.calysLength = 4;
		flower2.petalLength = 1;
		
		System.out.printf("%s은 꽃잎 길이가 %dcm, 꽃받침 길이가 %dcm 입니다.\n", flower1.flowerName, flower1.calysLength, flower1.petalLength);
		System.out.printf("%s는 꽃잎 길이가 %dcm, 꽃받침 길이가 %dcm 입니다.", flower2.flowerName, flower2.calysLength, flower2.petalLength);
	}
}
/*
창포꽃은 꽃잎 길이가 7cm, 꽃받침 길이가 2cm 입니다.
코스모스는 꽃입 길이가 4cm, 꽃받침 길이가 1cm 입니다.
*/