package java018_collection;

import java.util.TreeMap;

/*
 * TreeMap
 * 1. Map 인터페이스를 구현한 클래스이다.
 * 2. 정렬을 제공하는 클래스이다.
 */
public class Java196_TreeMap {

	public static void main(String[] args) {
		TreeMap<Integer, String> tmap = new TreeMap<Integer, String>();
		tmap.put(10, "java");
		tmap.put(30, "spring");
		tmap.put(20, "java");

		for(Integer key : tmap.keySet())
			System.out.printf("%d:%s\n", key, tmap.get(key));
			
	}//end main()

}//end class
