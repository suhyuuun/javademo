package java018_collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/*
 * HashMap
 * 1. Map인터페이스를 구현한 클래스이다.
 * 2. Hashtable은 동기화 처리하고, HashMap은 비동화 처리한다.
 * 3. Hashtable과 HashMap의 다른 기능들은 거의 같다.
 */
public class Java195_HashMap {

	public static void main(String[] args) {
		HashMap<Integer, Number> map = new HashMap<Integer, Number>();
		map.put(1, new Integer(10)); //map.put(1,10);
		map.put(2, new Double(4.5)); //map.put(2,4.5);
		map.put(3, new Float(2.3f)); //map.put(3, 2.3f);

		System.out.println(map.get(2));
		
		System.out.println("=======================");
		Set<Integer> set = map.keySet();
		Iterator<Integer> ite = set.iterator();
		while(ite.hasNext()) {
			Integer key = ite.next();
			System.out.printf("%d:%s\n",key, map.get(key));
		}
		
		System.out.println("=======================");
		for(Integer key : map.keySet())
			System.out.printf("%d:%s\n",key,map.get(key));
		
	}//end main()

}//end class

//Map : key, value 저장