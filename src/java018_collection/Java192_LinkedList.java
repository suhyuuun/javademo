package java018_collection;

import java.util.Iterator;
import java.util.TreeSet;

//set 중복불가 Tree 정렬
//TreeSet 사용시 중복된 값 정리 및 정렬해서 가지고 옴. 따라서 처리속도는 느리나 가지고 오는 것은 빠르다.

//TreeSet : 오름차순 정렬, 중복 안됨
public class Java192_LinkedList {

	public static void main(String[] args) {
		
		TreeSet<Integer> tree = new TreeSet<Integer>();
		Integer it1 = new Integer(10);
		Integer it2 = new Integer(40);
		Integer it3 = new Integer(20);
		Integer it4 = new Integer(30);
		Integer it5 = new Integer(20);
		
		tree.add(it1);
		tree.add(it2);
		tree.add(it3);
		tree.add(it4);
		tree.add(it5);
		
		System.out.println("===오름차순===");
//		System.out.println(tee.size());
		
		int cnt = tree.size();
		
//		for(int i = 0; i<cnt; i++) {
//			Integer value = tree.pollFirst();
//			System.out.println(value==it5); //같은 값을 저장하고 있어서 tree[1]은 true, 비교할 때 Integer와 int 상관없음
//			System.out.printf("tree[%d]=%d\n",i, value);
//		}
		
		for(Integer it : tree)
			System.out.println(it);
		
		Iterator<Integer> ita = tree.iterator();
		while(ita.hasNext())
			System.out.println(ita.next());
			
		System.out.println("===내림차순===");
		Iterator<Integer> ite = tree.descendingIterator();
		while(ite.hasNext())
			System.out.println(ite.next());
	}//end main()

}//end class
