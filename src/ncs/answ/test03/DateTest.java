package ncs.answ.test03;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateTest {

	public static void main(String[] args) {
		GregorianCalendar gc = new GregorianCalendar(1987, 4 , 27);
		
		SimpleDateFormat fm = new SimpleDateFormat("yyyy년 M월 d일 E요일");
		System.out.println("생일 :" + fm.format(gc.getTime()));
				
		GregorianCalendar qc = new GregorianCalendar();
		SimpleDateFormat dm = new SimpleDateFormat("yyyy년 M월 d일");
		System.out.println("현재 :" + dm.format(qc.getTime()));
		
		System.out.println("나이 : " + (qc.get(Calendar.YEAR) - gc.get(Calendar.YEAR) + 1) + "세");
				
	}

}
