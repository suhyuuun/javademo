package java019_inner.part03;

//local place에서는 final이 중요
public class OuterLocal {
	private int x;
	static int y;
	final private int z = 10;

	public void call(/*final*/ int a) { //메소드, local에서 매개변수 사용하려면 final 반드시 붙어있어야함, 내부에서 final 붙이기
		final int b = 20;
		int c = 30;
		//a = 300; // 매개변수 //매개변수에 final을 붙이면 새로운 값 할당 불가
		//c = 500; // 지역변수
		System.out.printf("a=%d\n", a);

		class InnerLocal {
			void prn() {
				x = 5;
				y = 150;
				//z = 20; //새로운 값 할당불가(final)
				System.out.println("x = " + x);
				System.out.println("y = " + y);
				System.out.println("a = " + a); //매개변수에 final 붙이면 local에서 사용가능 or 한가지의 용도로만 사용가능, 메소드에서 매개변수 사용안하면 내부에서 final 안 붙어있어도 final 붙여서 처리
				System.out.println("b = " + b);
				System.out.println("c = " + c); //값을 변경안하면 내부에서 final로 처리, 새로운 값을 할당하는 순간 final이 될 수 없음
			}// end prn()
		}// end InnerLocal class
		
		//객체생성은 class 밖에서 
		InnerLocal inner = new InnerLocal();
		inner.prn();
	}// end call()
}// end class
