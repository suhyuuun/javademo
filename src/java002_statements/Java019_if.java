package java002_statements;
/*
 * 다중 if-else
 * if(조건식){
 * 
 * }else if(조건식){
 *  수행할 문장;
 *  }else if(조건식){
 *  수행할 문장;
 *  }else{
 *  수행할 문장;
 *  }
 */
public class Java019_if {
	public static void main(String[]args) {
		char code = 'B';
		
		if (code=='A') {
			System.out.println("식품류");
		}else if(code=='B') {
			System.out.println("육류");
		}else if(code=='C') {
			System.out.println("공산품");
		}else {
			System.out.println("기타");
		}
	}
}
