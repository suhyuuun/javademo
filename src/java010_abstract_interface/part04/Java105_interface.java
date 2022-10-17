package java010_abstract_interface.part04;
/*
 * 인터페이스(interface)
 * 1. 추상메소드와 상수를 가지고 있는 형태이다.
 * 2. 클래스 작성에 도움을 주기 위한 목적으로 제고오디는 표준명세서이다.
 * 3. implements : 클래스에 인터페이스를 구현할 때 사용되는 키워드이다.
 * 4. 인터페이스는 접근제어자로 public만 제공한다.
 * 5. 인터페이스느 추상메소드에 abstract 키워드를 명시하지 않아도 된다.
 * 		-> 자바가상머신에서 자동으로 처리하기 때문
 * 6. 모든 인터페이스의 메소드는 묵시적으로 public abstract이다.
 * 7. 멤버변수는 묵시적으로 public static final이다.
 * 8. 객체 생성은 하지 못하지만, 참조형 타입으로서는 사용가능하다.
 * 		public static final int num = 10;
 * 		public abstract void prn();
 * 
 *               class         interface
 * 멤버변수           O              상수
 * 메소드          선언부+구현부     선언부(추상메소드)
 * 생성자            O               X
 * 초기화블록         O               X
 * 내부클래스         O               O
 * 
 * extends : 클래스에 클래스 상속 (단일 상속), 인터페이스에 인터페이스 상속(다중 상속)
 * implements : 클래스에 인터페이스 구현(다중 구현)
 */
public class Java105_interface {

	public static void main(String[] args) {
		System.out.println(CarRun.carcount); //인터페이스.멤버변수
		CarRun.Sun s = new CarRun.Sun(); 
		
		Truck tk = new Truck();
		tk.prn();
	}

}
