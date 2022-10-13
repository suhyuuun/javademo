package java008_static_access.part01;
//같은 클래스로 생성된 객체끼리 공유 
/*
 * static
 * 1. class loader일때 method area에 저장이 된다.
 * 2. 같은 클래스로 생성된 객체끼리 공유해서 사용한다.
 * 3. static 키워드가 선언된 메소드에서 this, super 키워드를 사용할 수 없다.
 * */
public class Java083_static {

	public static void main(String[] args) {
		
		System.out.printf("StaticEx.y=%d\n", StaticEx.y);
		//System.out.printf("StaticEx.y=%d\n", StaticEx.x);
		//static 선언되어있는 곳에서 non-static 불러올수없음

		StaticEx se = new StaticEx();
		System.out.printf("se.x=%d, se.y=%d\n", se.x, se.y);
		//static으로 선언되었으므로 StaticEx.y라고 쓰는 것 권장해서 노란줄
		
		StaticEx ss = new StaticEx();
		System.out.printf("ss.x=%d, ss.y=%d\n", ss.x, ss.y);
		
		se.x = 20;
		se.y = 30;
		System.out.printf("se.x=%d, se.y=%d\n", se.x, se.y);
		System.out.printf("ss.x=%d, ss.y=%d\n", ss.x, ss.y);

	}

}
