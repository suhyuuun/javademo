package java010_abstract_interface.part02;

public class Rect extends Shape {
	public Rect() {
		
	}
	
	public Rect(int height, int width) {
		super(height, width);
	}
	
	@Override
	double getArea() {
		return getHeight() * getWidth();
	}
}
