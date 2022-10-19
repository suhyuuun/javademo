package java012_api;

public class Java131_StringBuffer {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("java test");
		display(sb.toString().toCharArray());
	}//end main()

	public static void display(char[]data) {
		for(char cn: data) {
			
			System.out.print(cn);
		}
	}//end display
}//end class
