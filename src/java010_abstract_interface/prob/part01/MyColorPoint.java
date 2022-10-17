package java010_abstract_interface.prob.part01;

public class MyColorPoint extends MyPoint{
	String color;
	
	public MyColorPoint(int x, int y, String color) {
		super(x,y);
		this.color = color;
	}
	
	@Override
	protected void move(int x, int y) {
		
	}
	
	@Override
	protected void reverse() {
		int temp =0;
		temp = x;
		x = y;
		y = temp;
	}
	
	@Override
	protected void show() {
		System.out.println(x + "," + y + ","+color);
	}
}
