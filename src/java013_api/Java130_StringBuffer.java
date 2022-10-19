package java013_api;

public class Java130_StringBuffer {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("java test");
		
		//4인덱스에 ",jsp" 문자열 삽입(중간에 넣는 것) , 4인덱스를 뒤로 미루고 삽입한 문자가 추가됨 (cf. append: 마지막에 문자열 추가)
		sb.insert(4,",jsp");
		System.out.println(sb); //java,jsp test
		
		//4인덱스부터 8인덱스미만 사이의 문자열 삭제
		sb.delete(4, 8);
		System.out.println(sb); //java test
		
		//마지막에 문자열 추가
		sb.append(" start");
		System.out.println(sb); //java test start
		
		//문자열을 반대로 변경
		sb.reverse();
		System.out.println(sb); //trats tset avaj
		
		//String -> StringBuffer -> String
		String data = "mybatis orm";
		StringBuffer sf = new StringBuffer(data); // String -> StringBuffer
		sf.reverse();
		System.out.println(sf); //mro sitabym
		System.out.println(data); //mybatis orm
		String re = sf.toString();
		System.out.println(re); //mro sitabym -> StringBuffer -> String
		
		//char[] -> String -> StringBuffer
		char[] arr = {'k','o','r','e','a'};
		String sp = String.valueOf(arr);
		StringBuffer se = new StringBuffer(sp);
		//StringBuffer sr = new StringBuffer();
		//sr.append(sp);
		se.reverse();
		System.out.println(se); //aerok

		System.out.println(new StringBuffer(String.valueOf(arr)).reverse()); //aerok
		
		//StringBuffer -> String -> char[]
		String st = se.toString();
		char[]val = st.toCharArray();
		System.out.println(val); //aerok
		
		System.out.println(se.toString().toCharArray()); //aerok
	}//end main()

}//end class
