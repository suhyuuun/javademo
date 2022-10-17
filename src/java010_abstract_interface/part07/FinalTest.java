package java010_abstract_interface.part07;

public class FinalTest {
	final int CODE = 1;//final 선언 변수는 초기값을 할당해야한다. 대문자사용
	
	public FinalTest() {
		
	}
	
	void display() {
		System.out.println("display");
	}
	
	final void process() {//메소드에 final을 붙이면 다른 상속한 클래스에서 오버라이딩불가 
		System.out.println("process");
	}
}
