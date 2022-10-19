package java013_api;
/*
 * java.lang.String: immutable(불변)
 * java.lang.StringBuffer: mutable(가변), 동기화
 * java.lang.StringBulider: mutable(가변), 비동기화 -> 스레드 개념할때 확인
 * 
 * 
 * StringBuffer 특징
 * 1. 문자열 값을 수정할 수 있는 mutable(가변)이다.
 * 2. 기본 16문자 크기로 지정된 버퍼를 이용하며, 크기를 증가시킬 수 있다.
 */
public class Java129_StringBuffer {

	public static void main(String[] args) {
		String sg = new String("java test java");
		String ss = sg.replace("java","jsp");
		System.out.println("ss: " + ss); //ss: jsp test jsp
		System.out.println("sg: " + sg);//sg: java test java
		System.out.println(ss==sg); //false -> 주소비교
		System.out.println(sg.toString()); //java test java -> 문자열값이 나옴
		
		StringBuffer sb = new StringBuffer("spring test");
		StringBuffer su = sb.replace(0, 6, "framework");
		System.out.println("sb: " + sb); //sb: framework test -> StringBuffer는 가변이므로 sb의 문자열값이 바뀜
		System.out.println(sb==su); // true
		System.out.println(sb.equals(su)); //true
		System.out.println(sb.toString()); //framework test -> 문자열값이 나옴
		
		
	}//end main()

}//end class
