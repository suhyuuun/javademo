package java014_api.prob;

/*
 * [출력결과]
 * *****음료수 주문****
 * 고객님은 음료수 콜라, 3개를 주문하셨습니다.
 * 지불하실 금액은 3000원 입니다.
 * 
 * * *****음료수 주문****
 * 고객님은 음료수 사이다, 2개를 주문하셨습니다.
 * 지불하실 금액은 2400원 입니다.
 */

public class Prob005_String {

	public static void main(String[] args) {
		String done="콜라:1000:3";
		String[] arr1=tokenData(done);
		Drink d1=process(arr1);
		d1.display();
		
		String dtwo="사이다:1200:2";
		String[] arr2=tokenData(dtwo);
		Drink d2=process(arr2);
		d2.display();

	}//end main()
	
	public static String[] tokenData(String data){
		
		return null;
	}
	
	public static Drink process(String[] data){
		
		return null;
	}
	
	

}//end class
