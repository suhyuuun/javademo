package java014_api.answ;


import java.util.Calendar;

/*
 * [출력결과]
 * <4시부터 12시 미만일때>
 * 지금은 5시 35분입니다.
 * Good Morning
 * 
 * <12시부터 18시 미만일때>
 * 지금은 16시 49분입니다.
 * Good Afternoon
 * 
 * <18시부터 22시 미만일때>
 * 지금은 20시 30분입니다.
 * Good Evening
 * 
 *  <그외 일때>
 *  Good Night
 */

public class Prob003_Calendar {
	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		int hourOfDay = now.get(Calendar.HOUR_OF_DAY);
		int minute = now.get(Calendar.MINUTE);		
		System.out.println("지금은 " + hourOfDay + "시 " + minute + "분입니다.");
		
		if(hourOfDay >= 4 && hourOfDay < 12) 
			System.out.println("Good Morning");
		else if(hourOfDay >= 12 && hourOfDay < 18) 
			System.out.println("Good Afternoon");
		else if(hourOfDay >= 18 && hourOfDay < 22) 
			System.out.println("Good Evening");
		else
			System.out.println("Good Night");			
	}
}
