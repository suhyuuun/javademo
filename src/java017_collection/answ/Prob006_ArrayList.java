package java017_collection.answ;
import java.util.ArrayList;
/*
 * [프로그램 실행결과]
 * 
 * 주가종목 : 삼성전자
 * 현재가격 : 10000
 * 등락가격 : 2000
 * 
 * 주가종목 : NAVER
 * 현재가격 : 7000
 * 등락가격 : 2500
 */

public class Prob006_ArrayList {

	public static void main(String[] args) {
		 ArrayList<Kospi> aList=new ArrayList<Kospi>();
		 aList.add(new Kospi("삼성전자",10000,"상승가[2000]"));
		 aList.add(new Kospi("현대차",8000,"하락가[-1000]"));
		 aList.add(new Kospi("POSCO",8500,"보합[0]"));
		 aList.add(new Kospi("NAVER",7000,"상승가[2500]"));	
		 prnDisplay(aList);
	}//end main()
	
	public static void prnDisplay(ArrayList<Kospi> aList){
		//상승 종목을 출력하는 프로그램을 구현하시오.
		for(Kospi kp : aList){
			//상승가[2500]
			String fc=kp.getFluctuation();
			int open=fc.indexOf('[');
			int close=fc.indexOf(']');
			if(fc.substring(0,open).equals("상승가")){
				System.out.printf("주가종목 : %s\n",kp.getStock());
				System.out.printf("현재가격 : %d\n",kp.getPrice());
				System.out.printf("등락가격 :%s\n\n",fc.substring(open+1,close));
			}
		}
		
		
	}//end prnDispaly()
	

}//end class








