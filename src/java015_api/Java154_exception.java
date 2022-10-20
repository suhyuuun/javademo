package java015_api;

public class Java154_exception {

	public static void main(String[] args) {
		int[] num = new int[3];
		num[0] = 10;
		System.out.println(num[0]);
		process(num);
		try {
			display(num);
		}catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println(ex.toString());
		}
	}// end main()

	public static void display(int[]num) throws ArrayIndexOutOfBoundsException{
		System.out.println(num[5]);
	}//end display()
	
	public static void process(int[] num) {
		// try catch(), try finally, try catch() finally
		try {
			// 예외 발생 가능 구문
			// 예외 발생 가능 구문에서 예외가 일어나지 않으면 finally로 이동
			System.out.println(num[4]);
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println(ex.getMessage()); // Index 4 out of bounds for length 3
			//System.out.println(ex.toString()); // java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 3
			//ex.printStackTrace(); // java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 3 at java014_api.Java154_exception.main(Java154_exception.java:14)
		} finally {
			System.out.println("program end");
		}
	}// end process()
	
}// end class
