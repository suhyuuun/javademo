package java012_api;
/*
 * JAVA API(application Programming Interface)
 * Object
 * 1. 클래스 중에서 최상의 클래스이다.
 * 2. Object를 제외한 모든 클래스들은 Object를 상속받고 있다.
 * 3. java.lang패키지에서 제공하는 클래스이다.
 */
public class Java114_Object {

	public static void main(String[] args) {
		Object obj = new Object();
		//java.lang.Object@7d6f77cc
		System.out.println(obj);
		//java.lang.Object@7d6f77cc
		System.out.println(obj.toString());
		
		int x = 5;
		int y = 5;
		//값비교(기본 데이터 타입)
		//x=5 y=5 x==y:true
		System.out.printf("x=%d y=%d x==y:%b\n",x,y, x==y);
		
		Object ojt = new Object();
		//주소비교(참조 데이터 타입)
		//obj==ojt:false
		System.out.printf("obj==ojt:%b\n",obj==ojt);
		
		//equals( ): 주소비교 - 객체비교만 가능하다.
		//obj.equals(ojt):false
		System.out.printf("obj.equals(ojt):%b\n",obj.equals(ojt));
		
		//class java.lang.Object
		System.out.println(obj.getClass());
		
		//java.lang.Object
		System.out.println(obj.getClass().getName());
		
		//리턴타입 int
		int num = obj.hashCode();
		//2104457164
		System.out.println(num);
		
		
	}

}
