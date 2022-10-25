package ncs.test4;
/*
 * [실행결과]
 * 상품명 : 갤럭시 s7
 * 가격 : 563500원
 * 수량 : 3개
 * 총 구매 가격 : 1690500원
 */
public class ProductTest {

	public static void main(String[] args) {
		Product pt = new Product();
		pt.setName("갤럭시 s7");
		pt.setPrice(563500);
		pt.setQuantity(3);
		
		System.out.println(pt.information());
		
	}

}
