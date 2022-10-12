package java006_class.part06;

public class Java070_constructor {

	public static void main(String[] args) {
		/*
		 * 1. HandPhone hp : stack area에 4바이트 메모리 생성
		 * 2. new : heap area에 객체르 ㄹ생성
		 * 3. HandPhone() : heap area에 생성된 맴버변수에 초기값을 할당
		 * 4. = : heap area에 생성된 객체의 메모리 주소를 stack area에 할당
		 */
		HandPhone hp = new HandPhone();
		hp.display();

		
		HandPhone hn = new HandPhone("홍길동");
		hn.display();
		
		HandPhone he = new HandPhone("홍길동","010-1234-5678");
		he.display();
	}

}
