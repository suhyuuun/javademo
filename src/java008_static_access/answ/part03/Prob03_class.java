package java008_static_access.answ.part03;

public class Prob03_class {

	public static void main(String[] args) {
		// 자바의정석, 김자바, 150을 setter로 대입, toString으로 출력
		// [출력] 자바의정석의 저자는 김자바이고 150페이지로 구성됨
		Book bk1 = new Book();
		bk1.setTitle("자바의정석");
		bk1.setAuthor("김자바");
		bk1.setPage(150);
		System.out.println(bk1.toString());

		// 생성자에 JSP무조건따라하기, 송JP, 200대입후 getter이용해서 출력
		// 책이름 : JSP무조건따라하기
		// 책저자 : 송JP
		// 페이지 : 200페이지
		Book bk2 = new Book("JSP무조건따라하기", "송JP", 200);
		System.out.println("책이름 : " + bk2.getTitle());
		System.out.println("책저자 : " + bk2.getAuthor());
		System.out.println("페이지 : " + bk2.getPage() + "페이지");

	}// end main()

}// end class
