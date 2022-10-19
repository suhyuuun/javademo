package java013_api;

import java.util.StringTokenizer;
//Ctrl + Shift + O : 자동으로 import가 생김
//오류뒤에 ctrl + spacebar

public class Java132_StringTokenizer {

	public static void main(String[] args) {
		// StringTokenizer("문자열","구분자")
		// 문자열의 구분자가 공백일때는 2번째 인자값은 생략 할 수 있다.
		// StringTokenizer st = new String("java,jsp", ",")

		StringTokenizer st = new StringTokenizer("java jsp"); // import 필요
//		System.out.println(st.countTokens());// 2
//		System.out.println(st.nextToken());// java
//		System.out.println(st.countTokens());// 1
//		System.out.println(st.nextToken());// jsp
//		System.out.println(st.countTokens());// 0
//		System.out.println(st.nextToken()); // Exception in thread "main" java.util.NoSuchElementException

//		for(int i = 0;i<st.countTokens();i++) {
//			System.out.println(st.nextToken());
//		}//2번째 턴에서 countTokens()값이 변해서 원하는 값을 출력할 수 없음

//		int count = st.countTokens();
//		for(int i = 0;i<count;i++) {
//			System.out.println(st.nextToken());
//		}//countTokens()의 값을 변수선언을 한뒤 실행하면 원하는 값 출력가능
		
		
		//.hasMoreTokens() -> 논리값으로 출력 (has, is로 시작하는 것들은 왠만하면 논리값출력)
		//메모리에 저장된 토큰이 있으며 true, 없으면 false를 리턴한다.
		while(st.hasMoreTokens()){
			System.out.println(st.nextToken());
		}
			
	}//end main()

}//end class
