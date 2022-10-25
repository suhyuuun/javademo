package java018_collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Java204_RemoveIf {

	public static void main(String[] args) {
		Integer[] it = new Integer[] {3,5,2,4,7};
		
		ArrayList<Integer> aList = new ArrayList<Integer>(Arrays.asList(it));
		System.out.println(aList.toString());
		
		//argument를 받아 true값으로 반환되는 요소만 삭제
		//Predicate<Integer> p = x -> x%2==0; //람다식
		//aList.removeIf(p);
		
		aList.removeIf(x -> x % 2 == 0);
		
		Consumer<Integer> con = x -> System.out.println(x);
		System.out.println(aList.toString());
	}//end main()

}//end class
