package day0609;

import java.util.Calendar;

public class Calendar1 {
	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		// getInstance()메서드는 Calendar클래스를 구현한 클래스의 인스턴스를 반환한다.
		
		System.out.println(now);
		
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH) + 1;
		int day = now.get(Calendar.DATE);
//		int day = now.get(Calendar.DAY_OF_MONTH); 둘이 동일함!
		System.out.println(year + "년");
		System.out.println(month + "월");
		System.out.println(day + "일");
		
		int week = now.get(Calendar.DAY_OF_WEEK);
		System.out.println(week);
		String strWeek = null;
		
		switch(week) {
//		case 1 :
		case Calendar.SUNDAY:
			strWeek = "일요일";
			break;
//		case 2 :
		case Calendar.MONDAY:
			strWeek = "월요일";
			break;
//		case 3 :
		case Calendar.TUESDAY:
			strWeek = "화요일";
			break;
//		case 4 :
		case Calendar.WEDNESDAY:
			strWeek = "수요일";
			break;
//		case 5 :
		case Calendar.THURSDAY:
			strWeek = "목요일";
			break;
//		case 6 :
		case Calendar.FRIDAY:
			strWeek = "금요일";
			break;
//		case 7 :
		case Calendar.SATURDAY:
			strWeek = "토요일";
			break;
		} 
		
		System.out.println(strWeek);

		
		int amPm = now.get(Calendar.AM_PM);
		
		if(amPm == Calendar.AM)
			System.out.println("오전");
		else
			System.out.println("오후");
		
		int hour = now.get(Calendar.HOUR);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		
		System.out.println(hour + "시");
		System.out.println(minute + "분");
		System.out.println(second + "초");
		
	}
}
