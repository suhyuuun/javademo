package java001_basic.prob;
/*
* 동전교환프로그램
* 1 가장 적은 동전으로 교환할 수 있는 프로그램을 작성하시오
* 2 [출력결과]
*   500원: 15개 
    100원: 2개
    50원: 1개
    10원: 2개
    1원: 7개
    */

public class Prob07 {

	public static void main(String[] args) {
		int money = 7777;
		int mok=money/500;		
		
		//여기에 작성하시오.
		int hundred = (money - 500*mok)/100;
		int fifty = (money - 500*mok - 100*hundred)/50;
		int ten = (money -500*mok - 100*hundred - 50*fifty)/10;
		int one =money -500*mok - 100*hundred - 50*fifty - 10*ten;
		System.out.printf("500원: %d개\n 100원: %d개\n 50원: %d개\n 10원: %d개\n 1원: %d개", mok, hundred, fifty, ten, one);
		
	}//end main()

}//end class


