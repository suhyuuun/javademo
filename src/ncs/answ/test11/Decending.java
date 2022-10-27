package ncs.answ.test11;

import java.util.Comparator;

public class Decending implements Comparator<Integer>{
	
	@Override
	public int compare(Integer o1, Integer o2){
		//오름차순
		//return o1.compareTo(o2);
		
		//내림차순
		return o2.compareTo(o1);
		
	}
}
