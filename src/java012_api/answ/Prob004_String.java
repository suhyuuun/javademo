package java012_api.answ;

/* 
 * arr매개변수에서 '-'은 공백으로 , '/'은 ':'으로 변경한후
	리턴하는 프로그램을 구현하시오
 * [출력결과]
 * basic:java  web:jsp  framework:spring
 */
public class Prob004_String {

	public static void main(String[] args) {

		String data = "basic/java_web/jsp_framework/spring";
		System.out.println(process(data.toCharArray()));
	}// end main()

	static String process(char[] arr) {
		// arr매개변수에서 '_'은 공백으로 , '/'은 ':'으로 변경한후
		// 리턴하는 프로그램을 구현하시오
		for(int i=0; i<arr.length; i++){
			if(arr[i]=='_')
				arr[i]=' ';
			else if(arr[i]=='/')
				arr[i]=':';
		}

		return String.valueOf(arr);
	}// end process()

}// end class



















