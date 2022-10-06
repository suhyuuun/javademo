package java002_statements.prob;

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

		// 여기에 구현하시오.///////////////////////////////
		if(!(delivery=="택배")) {
			delivery = "퀵";
		}
		
		if(delivery=="택배") {
			if(product<30000) {
				deliveryMoney=3000;
				}else {
					deliveryMoney=0;
					}
		}
		
		if(delivery=="퀵") {
			if (product < 30000) {
				deliveryMoney = 12000;
			} else {
				deliveryMoney = 0;
			}
		}
		
		totalMoney = product + deliveryMoney;
		System.out.printf("물품금액:%d \n", product);
		System.out.printf("배달금액:%d \n", deliveryMoney);
		System.out.printf("총 금액:%d", totalMoney);

		///////////////////////////////

	}// end main()

}// end class
