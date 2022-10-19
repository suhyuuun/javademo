package java012_api.answ;

/*
 * 1 매개변수로 받은 문자열에서 각 단어의 첫 번째만
     리턴하는 makeInitial 메서드를 구현하시오. 
 * 2 출력결과
 *   JDBC
 *   JSP
 *   EJB
 */
public class Prob003_String {	
			
		public static void main(String[] args) {
			System.out.println(makeInitial("Java Data Base Conectivity"));
			System.out.println(makeInitial("Java Server Pages"));
			System.out.println(makeInitial("Enterprise Java Beans"));
		}//end main()

		private static String makeInitial(String fullName) {
			//fullName의 매개변수에서 각 단어의 첫글자만 
			//반환하는 프로그램을 구현하시오.
			String data="";
			
			for(int i=0; i<fullName.length(); i++){
				if(i==0 || fullName.charAt(i-1)==' ')
					data += fullName.charAt(i);
			}
			
			return data;
		}//end makeInitial()

}//end class














