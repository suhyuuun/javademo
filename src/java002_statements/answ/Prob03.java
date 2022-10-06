package java002_statements.answ;

/*
 * if~else문을 이용해서 물품판매에 대한 판매금액을 계산하는 프로그램을 구현하시오.
 * 
 * 1   판매수량*판매단가 금액이 
 *      30000미만일때 "택배" 배달이면 3000원
 *       "퀵"  배달이면  12000원의 배달료를 부여한다.
 *      단 그 외는 0원의 배달료를 부여한다.
 *      
 * 2  출력결과
 *    물품금액 : 20000원
 *    배달금액 :  3000원
 *    총  금액 : 23000원
 *     
 */

public class Prob03 {

	public static void main(String[] args) {
		int salesCount = 2; // 판매수량
		int salesMoney = 10000; // 판매단가
		String delivery = "택배"; // 배달방법
		int product = salesCount * salesMoney; // 물품금액
		int deliveryMoney = 0; // 배달금액
		int totalMoney = 0;// 총금액

		// 여기에 구현하시오.
		// if (product < 30000){
		if (salesCount * salesMoney < 30000) {
			if (delivery == "택배") {
				deliveryMoney = 3000;
			} else if (delivery == "퀵") {
				deliveryMoney = 12000;
			}
		} else {
			deliveryMoney = 0;
		}

		totalMoney = product + deliveryMoney;
		System.out.println("물품금액 : " + product + "원");
		System.out.println("배달금액 : " + deliveryMoney + "원");
		System.out.println("총  금액 : " + totalMoney + "원");

	}// end main()

}// end class
