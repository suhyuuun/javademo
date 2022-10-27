package ncs.answ.test11;

import java.util.*;

public class ListTest {

	public static void main(String[] args) {
		
		List<Integer>list = new ArrayList<Integer>();
		Random r = new Random();   //java.lang.Math.random()
		
		for(int i=0;i<10;i++)
			list.add(r.nextInt(100)+1);
		
		System.out.print("정렬 전 :");
		display(list);
		
		list.sort(new Decending());
		//Collections.sort(list, new Decending());
		System.out.print("정렬 후 : ");
		display(list);
	}
	
	public static void display(List list){
		System.out.println(list);
	}
}
