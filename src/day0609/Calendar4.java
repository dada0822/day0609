package day0609;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Calendar4 {
	public static void main(String[] args) {
		// Date -> Calendar 로 변환
		
		// 1. 현재 날짜 date 구하기
		Date date = new Date();
		
		// 2. Calendar 객체 생성
		Calendar cal = Calendar.getInstance();
		
		// 3. Date객체를 Calendar로 변환
		// cal.setTime(date) : date 객체를 cal 객체에 설정하여
		// date 객체가 나타내는 날짜와 cal이 나타내는 날짜가 같도록 함
		cal.setTime(date);
		
		// 4. date 객체, cal 객체 출력
		System.out.println(date);
		System.out.println(cal.getTime());
		
		System.out.println("----------------------------");
		
		// Calendar -> Date 변환
		
		// 1. 원하는 날짜로 객체 생성
		Calendar calendar = new GregorianCalendar(2022,5,9); // 서양력
		
		// 2. Calendar를 Date로 변경
		Date date1 = calendar.getTime();
		
		// 3. Date 출력
		System.out.println(date1);
	}
}
