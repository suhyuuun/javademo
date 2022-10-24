package java018_collection;

import java.util.Vector;

public class Java200_Vector {

	public static void main(String[] args) {
		Vector<String> v = new Vector<String>();
		v.add("java");
		v.add("jsp");
		v.add("spring");

		System.out.println(v.toString());

		Vector<String> t = new Vector<String>();
		t.add("java");
		t.add("mysql");
		System.out.println(t.toString()); // String 배열이 아닌 그냥 String returntype : String
		System.out.println(t.toString().length()); // 13

		v.removeAll(t); // v에서 t를 뺀값   v.toString - t.toString()
		System.out.println(v.toString()); //[jsp, spring]
	}// end main()

}// end class
