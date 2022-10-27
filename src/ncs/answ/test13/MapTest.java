package ncs.answ.test13;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTest {

	public static void main(String[] args) {
		Map<String, Inventory> map = new HashMap<String, Inventory>();

		map.put("삼성 갤럭시", new Inventory("삼성 갤럭시S7", new Date(2016, 3 - 1, 15), 30));
		map.put("LG G5", new Inventory("LG G5", new Date(2016, 2 - 1, 25), 20));
		map.put("애플 아이패드 Pro", new Inventory("애플 아이패드 Pro", new Date(2016, 1 - 1, 23), 15));

		for (Map.Entry<String, Inventory> entry : map.entrySet()) {
			//System.out.printf("%-10s\t %s\n", entry.getKey() + ",", entry.getValue());
			System.out.printf("%s\n",  entry.getValue());
		}
		
		int num = 20;
		if(num<=10)
		 System.out.println("출고 수량 10 적용시----------------------------------------------------");
		
		
		Inventory[] as=new Inventory[map.size()];	
		
		
		Set<String> set = map.keySet();		
		Iterator<String> ite = set.iterator();
		for(int i=0; i<as.length; i++) {		
			String key = ite.next();			
			as[i] = map.get(key);
			as[i].setGetAmount(num);
			as[i].setGetDate(new Date());
		}

		for (int i = 0; i < as.length; i++) {
			System.out.printf("%s\n", as[i].toString());
		}
	}
}
