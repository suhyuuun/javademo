package java009_inheritance.part01;

public class Father/*상속받는게 없으면 object 상속*/ /*extends Object*/ {
	int a = 3;
	private int c = 10; //상속되지 않음
	
	public Father() {
		System.out.println("Father");
	}
	void display() {
		System.out.println("a=" + a);
	}
}
