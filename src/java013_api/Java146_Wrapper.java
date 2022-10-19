package java013_api;
/*
 *sn변수에 저장된 문자열 중에서 숫자갯수를 출력하는 프로그램을 구현하시오
 *[출력결과]
 *숫자갯수 : 3
 */
public class Java146_Wrapper {

	public static void main(String[] args) {
		String sn = "korea12 paran3";
		int cnt = 0;
		
//		for(int i = 0; i<sn.length(); i++) {
//			char data = sn.charAt(i);
//			if(Character.isDigit(data))
//				cnt ++;
//		}
		
		
		char[] line = sn.toCharArray();
		for(char data : line) {
			if(Character.isDigit(data))
				cnt++;
		}
		
		
		System.out.println("숫자갯수 : " + cnt);
		
	}//end main()

}//end class
