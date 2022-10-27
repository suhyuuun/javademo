package ncs.answ.test04;

import java.util.Scanner;

public class ProductTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("상품명:");
		String name = sc.nextLine();
		System.out.print("상품가격:");
		int price = sc.nextInt();
		System.out.print("상품수량:");
		int quantity = sc.nextInt();
		sc.close();
		
		Product pd = new Product(name, price, quantity);
		System.out.println(pd.information());
		System.out.printf("총 구매 가격:  %d 원", pd.getPrice()*pd.getQuantity());

	}

}
