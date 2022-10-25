package java018_collection;

import java.util.Comparator;

public class Ascending implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		//return o2>o1 ? -1 : o2<o1? 1 : 0;
		return o1.compareTo(o2);
		//integer클래스에 comparable을 상속받아 compareTo가 구현되어있음
	}
	
}
