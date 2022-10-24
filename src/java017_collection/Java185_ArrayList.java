package java017_collection;

import java.util.ArrayList;

public class Java185_ArrayList {

	public static void main(String[] args) {
		ArrayList<String> aList = new ArrayList<String>();
		aList.add(new String("java"));
		aList.add(new String("jsp"));
		aList.add(new String("spring"));
		prnDisplay(aList);
		process(aList); //true
	}//end main()

	public static void prnDisplay(ArrayList<String> aList) {
		//aList매개변수의 요소에서  'j'가 포함되어 요소만 출력하는 프로그램을 구현하시오.
		
		for(String sn : aList) { //문자열 비교
			if(sn.toLowerCase().contains("j"))
				System.out.println(sn);
		}
	}//end prnDisplay
	
	public static void process(ArrayList<String> aList) { //요소 비교
		System.out.println(aList.contains("jsp"));
	}
}//end class
