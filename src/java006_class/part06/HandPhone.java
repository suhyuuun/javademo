package java006_class.part06;
/*
 * 생성자(constructor)
 * 1. 객체의 초기값 할당
 * 2. 생성자명은 클래스명하고 같다.
 * 3. 생성자는 클래스에서 1개 이상 존재한다.
 * 4. 클래스에 정의된 생성자가 없으면 JVM에서 기본 생성자를 제공한다.
 * 	  [기본생성자]
 * 	  - 클래스의 접근제어자와 같고 파라미터가 없는 구조이다.
 * 	    public HandPhone(){}
 * 	  - 클래스에 정의된 생성자가 존재하면 기본 생성자는 JVM에서 제공하지 않는다.
 * */
public class HandPhone {
	
	//멤버변수
	String name;
	String number;
	
	//기본 생성자 -> 생성자 이름은 클래스명 그대로 사용
	//public HandPhone() { }
	
	HandPhone(String name, String number){
		this.name=name;
		this.number=number;
	}
	
	//생성자 만들어야 한다면 위에 기본생성자를 생성해 줘야함
	HandPhone() { }
	//같은 이름의 생성자 사용가능
	HandPhone(String name){
		this.name=name;
	}
	
//오버로딩, 타입이 같은 생성자 여러개 사용불가
//	HandPhone(String number){
//		this.number=number;
//	}
	
	//메소드
	void display() {
		System.out.printf("%s %s\n", name, number);
	}
}
