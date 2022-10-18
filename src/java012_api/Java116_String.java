package java012_api;

public class Java116_String {

	public static void main(String[] args) {
		//리터널 형식 => 같은 주소를 가르킴
		String sn = "java";
		String sg = "java";
		
		//새로운 메모리를 생성 => 각자 다른 주소가 생김
		String st = new String("java");
		String ss = new String("java");
		
		//주소비교
		//String은 참조타입
		System.out.printf("sn==sg:%b\n",sn==sg); //true
		System.out.printf("st==ss:%b\n",st==ss); //false
		
		//equals() : 메모리에 저장된 문자열 비교, 대소문자 비교 O
		//equalsIgnoreCase() : 메모리에 저장된 문자열 비교, 대소문자 비교 X
		System.out.printf("sn.equals(sg):%b\n", sn.equals(sg)); //true
		System.out.printf("st.equals(ss):%b\n",st.equals(st)); //true
		
		System.out.println(sn.toString()); //java
		System.out.println(sn); //java

		
		

	}

}
