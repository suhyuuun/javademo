package java010_abstract_interface.part01;

abstract public class CarAbs {
	int speed;
	String color;
	
	public CarAbs() {
		
	}
	
	abstract public void work(); //추상메소드(abstract method)
	
	public void display() {
		System.out.printf("%d %s\n",speed, color);
	}
}
