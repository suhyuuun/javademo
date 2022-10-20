package java015_api;

public class Java156_exception {

	public static void main(String[] args) {
		String data1 = "a";
		String data2 = "0";
		
		try {
			int x = Integer.parseInt(data1);
			int y = Integer.parseInt(data2);
			int res = x/y;
			System.out.println(res);
		}catch(ArithmeticException ex) {
			System.out.println(ex.toString());
		}catch(NumberFormatException ex) {
			System.out.println(ex.toString());
		}
		//다중 catch문 사용시 상속관계에 있는 것들 중 최상위의 catch를 가장 아래로 보낸다.

	}//end main()

}//end class
