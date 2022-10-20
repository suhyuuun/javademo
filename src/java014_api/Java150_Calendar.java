package java014_api;

import java.util.Calendar;

/*
 * 2016년 2월 마지막일과 요일을 구하는 프로그램을 구현하세요.
 * [출력결과]
 * 2016-2-29 월요일
 */
public class Java150_Calendar {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		int year = 2016;
		int month = 2;

		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, month - 1);

		// 2월의 마지막일
		int date = cal.getActualMaximum(Calendar.DATE);
		cal.set(Calendar.DATE, date);
		//System.out.println(cal.toString());

		// 요일
		int day = cal.get(Calendar.DAY_OF_WEEK);
		String yoil = " ";
		switch (day) {
		case (1):
			yoil = "일요일";
			break;
		case (2):
			yoil = "월요일";
			break;
		case (3):
			yoil = "화요일";
			break;
		case (4):
			yoil = "수요일";
			break;
		case (5):
			yoil = "목요일";
			break;
		case (6):
			yoil = "금요일";
			break;
		case (7):
			yoil = "토요일";
			break;
		}

		System.out.printf("%d-%d-%d %s\n", year, month, date, yoil);
	}

}
