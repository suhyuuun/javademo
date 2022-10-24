package java017_collection;

import java.util.Vector;
/*
 * 배열 : length 키워드
 * 문자열 : length() 메소드
 * 컬렉션 : size()메소드
 */

/*
 * 컬렉션 클래스를 선언하고 생성할 때 제너릭을 선언한다.
 * 제너릭(generic) : 컬렉션 클래스에 저당된 객체를 가져올때
 * 다운캐스팅하는 작업을 생략할 수 있도록 제공해주는 기능이다.
 */

public class Java180_Vector {

	public static void main(String[] args) {
		Vector<String> v = new Vector<String>();
		v.add(new String("java"));
		v.add(new String("jsp"));
		v.add(new String("spring"));
		
		//일반 반복문
		for(int i = 0; i<v.size(); i++) {
			String data = v.get(i);
			System.out.println(data);
		}
		
		//개선된 반복문
		//for(데이터타입 변수 : 배열 or 컬렉션) { }
		for(String data : v) {
			System.out.println(data);
		}
		
		//Number나 Number의 하위클래스를 모두 사용가능
		Vector<Number> vt = new Vector<Number>();
		//Integer -> Number -> Object : up-casting
		vt.add(new Integer(10));
		
		//Double -> Number -> Object : up-casting
		vt.add(new Double(10.4));
		
		//Float -> Number -> Object : up-casting
		vt.add(new Float(4.8f));
		
		for(Number ne : vt) {
			if(ne instanceof Integer) {
				Integer it = (Integer)ne;
				System.out.println(it);
			}
			if(ne instanceof Double) {
				Double de = (Double)ne;
				System.out.println(de);
			}
			if(ne instanceof Float) {
				Float ft = (Float)ne;
				System.out.println(ft);
			}
		}
		
		
	}//end main()

}//end class
