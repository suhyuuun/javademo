package java003_statements.answ;
/*
 * 
 * 2001부터 2012년사이에서 윤년을 구하시오 
 * 출력결과
 2004
 2008
 2012
 */

public class Prob_02 {

	public static void main(String[] args) { 

		for (int year = 2001; year <= 2012; year++) {

			if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
				System.out.println(year);

		}

	}// end main()

}// end class
