package java008_static_access.part02;
/*
 * class 클래스명{
 * 	멤버변수;
 * 	static{};
 * 	생성자();
 * 	메소드();
 * }
 */
public class OrderStatic {
	static {
		System.out.println("static"); //1
	}
	
	public OrderStatic() {
		System.out.println("constructor");//2
	}
	
	public void display() {
		System.out.println("display");
	}
}
