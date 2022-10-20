package java013_api;

import java.util.Calendar;

/*
 * 수능일 : 2022-11-17
 * 오늘 : 2022-10-20
 * 남은일 : 15
 */
public class Java151_Calendar {

	public static void main(String[] args) {
		Calendar examDay = Calendar.getInstance();
		int examDay_year = 2022;
		int examDay_month = 11;
		int examDay_date = 17;
		
		examDay.set(examDay_year, examDay_month-1, examDay_date);
		//System.out.println(examDay.toString());
		Calendar toDay = Calendar.getInstance();
		System.out.println(toDay);
		
		long eventDay = examDay.getTimeInMillis();
		long nowDay = toDay.getTimeInMillis();
		System.out.println("eventDay:" + eventDay);
		System.out.println("nowDay:" + nowDay);
		
		//하루 계산
		//System.out.println(60*60*24*1000);
		
		long endDay = (eventDay-nowDay) / (60*60*24*1000);
		System.out.printf("수능일: %d-%d-%d\n", examDay_year, examDay_month, examDay_date);
		System.out.printf("오늘: %d-%d-%d\n", Calendar.YEAR, Calendar.MONTH, Calendar.DATE);
		System.out.println("남은 일:" + endDay);
		
		
	}//end main()

}//end class
