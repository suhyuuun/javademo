package java006_class.prob;

public class Circle {
	String name;
	double radius;
	public void display() {
		System.out.printf("%s의 면적은 %.1f\n", name, radius*radius*3.14);
	}
}
