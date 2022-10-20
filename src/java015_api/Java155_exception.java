package java015_api;

public class Java155_exception {

	public static void main(String[] args) {
		StringBuffer sb = null;
		
		try {
			sb.reverse();
		}catch(NullPointerException ex) {
			sb = new StringBuffer("java");
			System.out.println(sb);
		}finally {
			System.out.println("program end");
		}
	}//end main()

}//end class
