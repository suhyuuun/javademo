package java012_api.prob;
/*
 * 정규화 표현식(Regular Expression) (regx)
 * 1. 정규화 표현식(정규식)이란 텍스트 데이터 중에서 원하는 조건(패턴)과 일치하는 문자열을 찾아내기 위해 사용하는 것으로 
 * 	  미리 정의한 기호와 문자를 이용해서 작성한 문자열을 말한다.
 */
public class Java124_RegEx {

	public static void main(String[] args) {
		String sn = "java korea";
		String sg = "";
		
		//a 또는 r이면 '_'로 변경
		
		for(int i=0;i<sn.length();i++) {
			char data = sn.charAt(i);
			if(data == 'a' || data == 'r') {
				sg += "_";
			}else 
				sg += data;
		}
		System.out.println(sg);
		
		System.out.println("Regular Expression을 이용한 문자 변경");
		//정규식에서 []대괄호의 의미는 or
		System.out.println(sn.replaceAll("[ar]", "_"));
	}//end main

}//end class
