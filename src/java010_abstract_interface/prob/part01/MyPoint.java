package java010_abstract_interface.prob.part01;

abstract public class MyPoint {
	int x;
	int y;
	public MyPoint(int x, int y)  {
		this.x = x; 
		this.y = y; 	
	}
	protected abstract void move(int x, int y); // 매개변수의 값을 멤버변수(필드)에  각각 저장
	protected abstract void reverse(); // (x, y)에서 (y, x)로 위치 변경
	protected void show() {
		System.out.println(x + "," + y);
		
	}
}//end class MyPoint
