package java005_method;
/*
 * [출력결과]
 * 10일때 -> 10는(은) 짝수입니다.
 * 9일때 -> 9는(은) 홀수입니다.
 * */
public class Java059_method {

	public static void main(String[] args) {
		int data = 10;
//		if(process(data)) {
//			System.out.printf("%d는(은)짝수입니다", data);
//		}else {
//			System.out.printf("%d는(은)홀수입니다", data);
//		}
		
//		String result = process(data)? "짝수" : "홀수";
//		System.out.printf("%d는(은)%s입니다", data, result);
		
		System.out.printf("%d는(은)%s입니다", data, process(data)? "짝수" : "홀수");
		
		
//		int a = 1;
//		System.out.printf("%d %d %d \n", ++a, ++a, ++a);
//		System.out.printf("%d %d %d \n", a++, a++, a++);

	}// end main()

	public static boolean process(int data) {
// data매개변수의 값이 짝수이면 true, 홀수이면 false를 리턴하는 메소드 구현
		
//		if (data % 2 == 0) {
//			return true;
//		} else {
//			return false;
//		}
		
		return data % 2 == 0 ? true : false;
		
	}// end process()
}//end class
