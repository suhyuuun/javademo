package java009_inheritance.part03;

public class SubConst extends SuperConst {
	int x = 50;
	public SubConst() {
		super(10, 40);
	}
	// SuperConst에 인자값이 없어서 super();로 되어있으면 컴파일 오류
	// super안에 인자값을 넣어준다.
}
