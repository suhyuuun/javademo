package ncs.test14;

import java.io.BufferedReader;
import java.io.IOException;

public class GoodsTest {

	public static void main(String[] args) {
		//BufferedReader에 대해 선언한다.
		BufferedReader br = null;
		Goods goods = new Goods();
		System.out.print("상품명 : ");
		
		try {
			String data = br.readLine();
			goods.setName(data);
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		//br에 대한 키보드 입력스트림 객체 생성하고, 입력처리하고 출력처리한다.ㄴ
		//try catch resource문으로 작성한다.
	}

}
