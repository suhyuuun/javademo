package java019_inner.part02;

public class OuterStatic {
	private int x;
	static private int y;

	static void call() {
		// x = 30; //호출불가
		y = 9;
		System.out.println(y);
	}

	static class InnerStatic {
		int z;

		void prn() {
			// 비 static 외부 자원을 static 내부클래스에서 참조할 수 없다.
			// x = 50;
			y = 20;
			z = 40;
			System.out.printf("y=%d, z=%d",y,z);
		}
	}
}
