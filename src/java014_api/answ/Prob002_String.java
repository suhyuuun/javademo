package java014_api.answ;

/*1 프로그램 실행할때  "JAva Test" 문자열을 args배열에서 값을 받아 출력결과에 같이
 *  나오도록 프로그램을 구현하시오.
 *  java Prob03 JAva Test
 *   * 
 * 2 출력결과
 *   source : JAva Test 
 *   convert: jaVA tEST
 *   length: 9
 *   reverse : tseT avAJ
 */

public class Prob002_String {

	public static void main(String[] args) { 
		String src = ""; //JAva Test 
		String cvt = ""; //jaVA tEST 
		int count=0;

		for (int i = 0; i < args.length; i++) {
			src += args[i] + " ";
			cvt += convert(args[i]) + " ";
			count+= args[i].length();
		}

		System.out.println("source :" +src );
		System.out.println("convert:" +cvt );
		System.out.println("length :" + (count+args.length-1));
		//문자열 앞,뒤 공백을 제거해주는 trim()메소드이다.
		/*StringBuffer sb=new StringBuffer(src.trim());
		StringBuffer rvs=sb.reverse();
		System.out.println("reverse:"+rvs);*/
		System.out.println("reverse:" +new StringBuffer(src.trim()).reverse());
		
		
	}// end main()

	public static String convert(String data) { //Test
		String arr="";  //tEST
       for(int i=0;i< data.length();i++){
    	  if(Character.isUpperCase(data.charAt(i)))
    			 arr+=Character.toLowerCase(data.charAt(i));
    	  else
    		  arr+=Character.toUpperCase(data.charAt(i));
       }
       return arr;
	}//end convert()
		
}// end class

