package ncs.test3;

import java.util.GregorianCalendar;

/*
 * [출력결과]
 * 생일 : 1987년 5월 27일 수요일
 * 현재 : 2016년 4월 18일
 * 나이 : 29세
 */
public class DateTest {

	public static void main(String[] args) {
		GregorianCalendar cal = new GregorianCalendar();
		int byear = 1987;
		int bmonth = 5;
		int bdate = 27;

		cal.set(GregorianCalendar.YEAR, byear);
		cal.set(GregorianCalendar.MONTH, bmonth - 1);
		cal.set(GregorianCalendar.DATE, bdate);
		
		int bday = cal.get(GregorianCalendar.DAY_OF_WEEK);
		String yoil = " ";
		switch (bday) {
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
		}
		System.out.printf("생일 : %d년 %d월 %d일 %s\n", byear, bmonth, bdate, yoil);

		int year = 2016;
		int month = 4;
		int date = 18;

		cal.set(GregorianCalendar.YEAR, year);
		cal.set(GregorianCalendar.MONTH, month - 1);
		cal.set(GregorianCalendar.DATE, date);
		System.out.printf("현재 : %d년 %d월 %d일\n", year, month, date);
		System.out.printf("나이 : %d세", year - byear);

	}

}
