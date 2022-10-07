package java003_statements.prob;
/*
 * 
 * 2001부터 2012년사이에서 윤년을 구하시오 
 * 1) 년도를 4로 나눈 나머지가 0이고 100로 나눈 나머지가 0이 아니다.
 * 2) 년도를 400로 나눈 나머지가 0이다.
 * 출력결과
 2004
 2008
 2012
 */

public class Prob_02 {

	public static void main(String[] args) {
		int leapYear = 0;
		for(int year=2001;year<=2012;year++) {
			if(year%4==0 && year%100!=0 || year%400==0) {
				leapYear = year;
				System.out.println(leapYear);
			}
		}
      
       
	}//end main()

}//end class













