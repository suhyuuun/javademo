package java012_api;

public class Java115_String {
	public static void main(String[] args) {
		char[] data = { 'j', 'a', 'V', 'A' };
		StringTest st = new StringTest(data);
		System.out.println(st.length()); // 4
		System.out.println(st.isUpperCase(2)); // true
		System.out.println(st.isUpperCase(0)); // false
		System.out.println(st.isLowerCase(2)); // false
		System.out.println(st.isLowerCase(0)); // true
		System.out.println(st.charAt(0)); //j
		System.out.println(st.toString()); //jaVA
		System.out.println(st); //jaVA
		
	}
}
