package java012_api.answ;

/*
 1 매개변수로 받은 문자열에서 각 단어의 첫 번째 글자만 대문자로 변환하여
 리턴하는 initcap() 메서드를 구현하시오. 
 2 예를 들어 "hello world java" 는 "Hello World Java"로 변환됩니다. 
 3 출력결과
 Hello World Java
 Java Programming
 */
public class Prob001_String {

	public static void main(String[] args) {
		System.out.println(initcap("hello world java"));
		System.out.println(initcap("java programming"));
	}// end main()

	private static String initcap(String str) {
		// 매개변수로 받은 문자열에서 각 단어의 첫 번째 글자만 대문자로
		// 변환하여 반환하는 프로그램을 구현하시오.
		String[]arr = str.split(" ");
		for(int i=0;i<arr.length;i++) {
			String.valueOf(arr[i].charAt(0)).toUpperCase();
		}
		return str;
		
	}// end initcap()
}// end class
