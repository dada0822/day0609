package day0609;

public class Wrapper1 {
	public static void main(String[] args) {
		// 문자열 -> 기본형
		int i = Integer.parseInt("100");
		
		// 문자열 -> 래퍼클래스
		Integer n = Integer.valueOf("100"); 
		
		// Boxing
		// 실행은 가능하지만 사용을 권장하지 않음
		Integer obj1 = new Integer(100);
		Integer obj2 = new Integer("100");
		
		Integer obj3 = Integer.valueOf("300");
		
		// UnBoxing
		int value1 = obj1.intValue();
		int value2 = obj2.intValue();
		int value3 = obj3.intValue();
		
		System.out.println(value1+value2+value3);
	}
}
