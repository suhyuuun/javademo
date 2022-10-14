package java009_inheritance.part03;

public class Java094_inheritance {

	public static void main(String[] args) {
		SubConst sc = new SubConst();
		System.out.printf("x=%d y=%d", sc.x, sc.y);
		//sc영역을 먼저 찾은 후 상속된 곳에서 찾음
	}

}
