package ncs.test13;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTest {

	public static void main(String[] args) {
		// Generics 적용된 맴 객체를 선언 할당한다.
		Map<String, Inventory> map = new HashMap<String, Inventory>();

		// 상품명을 키로 사용하여 저장 처리 한다.
		map.put("삼성 갤럭시", new Inventory("삼성 갤럭시S7", new Date(2016, 3 - 1, 15), 30));
		map.put("LG G5", new Inventory("LG G5", new Date(2016, 2 - 1, 25), 20));
		map.put("애플 아이패드 Pro", new Inventory("애플 아이패드 Pro", new Date(2016, 1 - 1, 23), 15));

		
		// 맵에 기록된 정보를 연속 출력한다. EntrySet() 사용한다.
		for(Map.Entry<String, Inventory>entry : map.entrySet()) {
			System.out.printf("%s\n", entry.getValue());
		}
		
		
		// 맵에 기록된 정보를 Inventory[]로 변환한 다음 출고 날짜를 오늘 날짜로, 출고 수량은 모두 10개로 지정한다. 예외처리
		int num = 20;
		if(num<=10)
			System.out.println("출고 수량 10 적용시----------------------------------------------------");
		
		Inventory[] as = new Inventory[map.size()];
		
		Set<String> set = map.keySet();
		Iterator<String> ite = set.iterator();
		for(int i = 0; i<as.length;i++) {
			String key = ite.next();
			as[i] = map.get(key);
			as[i].setGetAmount(num);
			as[i].setGetDate(new Date());
					}
		
		// 변경된 Inventory[] 의 정보를 모두 출력
		for(int i = 0; i<as.length;i++){
			System.out.printf("%s\n",as[i].toString());
		}
	}

}
