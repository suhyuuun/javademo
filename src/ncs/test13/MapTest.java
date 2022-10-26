package ncs.test13;

import java.util.HashMap;
import java.util.Map;

public class MapTest {

	public static void main(String[] args) {
		//Generics 적용된 맴 객체를 선언 할당한다.
		Map<String, Inventory> map = new HashMap<String, Inventory>();
		
		//상품명을 키로 사용하여 저장 처리 한다.
		//map.put("삼성 갤럭시S7", )
		//맵에 기록된 정보를 연속 출력한다. EntrySet() 사용한다.
		
		//맵에 기록된 정보를 Inventory[]로 변환한 다음 출고 날짜를 오늘 날짜로, 출고 수량은 모두 10개로 지정한다. 예외처리
		
		//변경된 Inventory[] 의 정보를 모두 출력

	}

}
