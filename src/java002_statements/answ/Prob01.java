package java002_statements.answ;

/*
 * switch~case문을 이용해서 년도에 해당하는 띠를 구하는 프로그램을 구현하시오.
 *  1. 12가지 띠
 *     원숭이, 닭, 개, 돼지, 쥐, 소, 호랑이, 토끼, 용, 뱀, 말, 양
 *  2 띠구하는 공식
 *    year%12의 결과가
 *    0이면 "원숭이", 1이면 "닭"  2이면 "개",    3이면 "돼지",
 *    4이면 "쥐",    5이면 "소", 6이면 "호랑이", 7이면 "토끼",
 *    8이면 "용",    9이면 "뱀", 10이면 "말",   11이면 "양"
 *    
 *  3 출력결과
 *    2012년도의 태생은  용띠입니다.  
 */

public class Prob01 {

	public static void main(String[] args) {
		int year=2016;	
		String animal="";

         //여기에 구현하시오.
		int res = year%12;
		//switch(year%12){
		switch(res){
		case 0: animal="원숭이"; break;
		case 1: animal="닭"; break;
		case 2: animal="개"; break;
		case 3: animal="돼지"; break;
		case 4: animal="쥐"; break;
		case 5: animal="소"; break;
		case 6: animal="호랑이"; break;
		case 7: animal="토끼"; break;
		case 8: animal="용"; break;
		case 9: animal="뱀"; break;
		case 10: animal="말"; break;
		case 11: animal="양";
		}
		
		
		System.out.println(year+"년도의 태생은 "+animal+"띠입니다.");

	}//end main()

}//end class
