package myutil;

import java.util.Date;
import java.util.Calendar;

public class DateCalendarTest {

	public static void main(String[] args) {
		// TODO java.util.Date/java.util.Calendar

		Date today = new Date();
		System.out.println(today);
		System.out.println(today.toString());
		
		Calendar cal = Calendar.getInstance(); //싱글톤. 객체가 여러개 만들어지지 않게 딱 하나의 객체만 생성
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH);
		int date = cal.get(Calendar.DATE);
		int hour = cal.get(Calendar.HOUR);
		int min = cal.get(Calendar.MINUTE);
		System.out.println("오늘 날짜는 " + year + "년 " + month + "월 " + date + "일 " + hour + "시 " + min + "분 입니다.");
	}
}
