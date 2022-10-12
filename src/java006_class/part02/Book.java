package java006_class.part02;
/*
 * [도서관리]
 * 제목               대출여부
 * 칼의 노래            대출중
 * 어두운 상점의 거리     대출가능
 * 
 * [객체 모델과정]
 * 객체의 특징 : 책제목, 대출여부
 * 객체의 기능 : 대출여부를 처리한다.
 * */
public class Book {
	String title;
	boolean state;
	
	String process() {
		if(state)
			return "대출가능";
	else
		return "대출중";
	}
	
	void display() {
		System.out.printf("%s, %s\n", title, process());
	}
	
	void borrow() {
		state = false;
	}
}

	