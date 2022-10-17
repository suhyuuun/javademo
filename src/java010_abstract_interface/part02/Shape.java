package java010_abstract_interface.part02;

//추상 클래스
abstract public class Shape {
	private int width;
	private int height;
	
	public Shape() {
		
	}
	public Shape(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public int getHeight() {
		return height;
	}
	
	public int getWidth() {
		return width;
	}
	
	abstract double getArea(); //추상메소드
	
	
}
