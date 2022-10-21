package java017_collection;

import java.util.Vector;

public class Java182_Vector {

	public static void main(String[] args) {
		//Vector 생성자에 인자값이 없으면 용량의 기본값은 10이다.
		Vector<String> v = new Vector<String>();
		v.addElement(new String("java")); //append
		v.add(new String("jsp")); //append
		v.add(1, new String("spring")); // insert

		for(int i = 0; i<v.size(); i++) {
			System.out.printf("v[%d]=%s\n",i,v.get(i));
		}
		
		//요소가 저장되어 있지 않은 메모리 제거
		v.trimToSize(); //하기 이전에는 10개, 한 이후 요소갯수와 같아짐
		
		System.out.println("용량크기 : " + v.capacity()); 
		System.out.println("요소갯수 : " + v.size()); 
		
	}//end main()

}//end class
