package java008_static_access.part03;

public class Java085_static {
	int x = 3;
	static int y = 5; //싱글톤 패턴(DB연동)할때 static 사용합니다용
	public static void main(String[]args) {
		//System.out.printf("x=%d\n",x); //static 선언된 곳에서 non-static 호출불가
		System.out.printf("y=%d\n",y); //static이라 호출가능
		//process(); //non-static 호출불가
		display(); //static 호출가능
		Java085_static js = new Java085_static();
		js.process();
	}//end main()
	
	public void process() {
		System.out.println("process");
		display();//non-static메소드에서 static 메소드 호출 가능 / 반대로는 불가능
		System.out.printf("x=%d\n",x); //static 선언안된 곳에서 non-static 호출가능
	}//end process()
	
	public static void display() {
		System.out.println("display");
	}//end display()
}
