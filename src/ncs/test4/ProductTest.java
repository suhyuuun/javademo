package ncs.test4;

import java.util.Scanner;

/*
 * [실행결과]
 * 상품명 : 갤럭시 s7
 * 가격 : 563500원
 * 수량 : 3개
 * 총 구매 가격 : 1690500원
 */
public class ProductTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("상품명 : ");
		String name = sc.nextLine();
		System.out.print("가격 : ");
		int price = sc.nextInt();
		System.out.print("수량 : ");
		int quantity = sc.nextInt();
		sc.close();
		
		Product pd = new Product();
		pd.setName(name);
		pd.setPrice(price);
		pd.setQuantity(quantity);
		System.out.println(pd.information());
		
		
		
		
	}

}
