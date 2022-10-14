package java008_static_access.part01;
//메소드영역
public class StaticEx {
	int x = 5; //heap area에서 생성
	static int y = 10; //method영역에서 생성됨 (heap area가 아님)

	public StaticEx() {
		
	}

	public String toString() {
		return String.format("x=%2d y=%2d\n", x,y);
	}
	
}
