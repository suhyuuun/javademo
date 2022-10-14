package java009_inheritance.part08;


public class Car {
	private int speed;
	String color;
	
	public Car() {
		
	}
	
	public int getSpeed() {
		return speed;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	@Override
	public String toString() {
		return String.format("차량의 색상:%s, 속도:%d", color,speed);
	}
	
	
}
