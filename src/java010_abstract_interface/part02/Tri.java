package java010_abstract_interface.part02;

public class Tri extends Shape {
public Tri() {
		
	}
	
	public Tri(int height, int width) {
		super(height, width);
	}
	
	@Override
		double getArea() {
			return getHeight() * getWidth() / 2;
		}
}
