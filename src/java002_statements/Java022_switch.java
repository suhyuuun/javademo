package java002_statements;
//멤버변수 : class에서 선언, 기본값이 제공됨 
//지역변수 : main에서 선언, 기본값 설정안해놓으면 error
//void : return 타입
public class Java022_switch {

	public static void main(String[] args) {
		//30 : 4, 6, 9, 11
		//31 : 1, 3, 5, 7, 8, 10, 12
		//28 or 29 : 2
		
		int year = 1996;//년도
		int month = 2;//월
		int lastDay;//마지막일 , switch문에서 default을 사용하였기 때문에 기본값을 설정하지 않아도 됨, default 사용안하면 기본값 넣어줘야함
		
		if(!(month>=1 && month<=12)) {
			System.out.println("1월 ~ 12월만 가능합니다.");
			return;//main()메소드를 빠져나옴
		}
		
		switch(month) {
		case 4:
		case 6:
		case 9:
		case 11: lastDay=30; break;
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12: lastDay=31; break;
		default:
			if(year%4==0 && year%100!=0 ||year%400==0) {
				lastDay=29;
			}else {
				lastDay=28;
			}
		}
		
		System.out.printf("%d년도 %d월의 마지막 일은 %d입니다.", year, month, lastDay);
	}//end main()

}//end class
