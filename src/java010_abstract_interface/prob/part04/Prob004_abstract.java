package java010_abstract_interface.prob.part04;


/*
 * [문제]
 * 출력결과를 참조하여 Staff클래스의 메소드을 구현하세요. 
 * 입력된 주민번호를 이용해서 년,월,일,성별을 구하는 로직을 구현하시오
 * 
 *  [출력결과]
 *  홍길동 1982년 10월 12일 남 태생
 *  이영희 2010년 9월 29일 여 태생
 *  주민번호 13자리를 입력하세요

 */
public class Prob004_abstract {
	
	public static void main(String[] args) {
		Staff sf=new Staff("홍길동","8210121544892");
		process(sf);
		
		Staff st=new Staff("이영희","1009294152591");
		process(st);
		
		Staff sn=new Staff("소몰이","96042523511");
		process(sn);
		
	}//end main()
	
	
	static void process(Staff data){
		/*
		 * 주민번호가 13자리이면
		 *   "홍길동 1982년 10월 12일 남 태생"
		 * 주민번호가 13자리가 아니면
		 *    "주민번호 13자리를 입력하세요" 
		 *  처럼 출력이 되도록 로직 구현 
		 */		
		
		if(data.getJumin().length()==13)
			System.out.printf("%s %d년 %d월 %d일 %c 태생\n",
					data.getName(),data.getYear(),
					data.getMonth(),data.getDATE(),data.gender());
		else
			System.out.println("주민번호 13자리를 입력하세요");
		
	}//end process()
   
}//end class









