package java007_class.part06;
/*
 * 오버로딩(overloading)
 * 1. 단일 클래스에서 같은 이름의 메소드를 여러개 정의하는 기능이다.
 * 2. 오버로딩의 조건
 * 		1) 메서드의 이름이 같아야 한다.
 * 		2) 매개변수의 갯수 또는 데이터 타입이 달라야 한다.
 * 		3) 리턴타입은 오버로딩을 구분하는데 사용되지 않는다.
 * */

public class Calculator {
	void addValue(int x, int y) {
		System.out.println("int, int");
		System.out.println(x + y);
	}

	void addValue(int x, int y, int z) {
		System.out.println("int, int, int");
		System.out.println(x + y + z);
	}

	void addValue(double x, double y) {
		System.out.println("double, double");
		System.out.println(x + y);
	}
}