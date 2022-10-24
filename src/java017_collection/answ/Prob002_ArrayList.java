package java017_collection.answ;

import java.util.ArrayList;
import java.util.List;



/*
 * [문제]문제 개요 : 책 목록(bookList) 에서 특정 종류에 해당하는
 *   책들만을 추출하여 가격의 총합을 리턴하는 getRentalPrice() 메소드를
 *   BookManager 클래스에 구현하시오. getRentalPrice() 메소드의 
 *   첫 번째 매개변수는 여러 BookDTO 객체가 저장되어 있는 ArrayList 이며, 
 *   두 번째 매개변수는 가격을 누적할 책 종류(kind) 이다. 
 *   
 *  [프로그램 실행결과]
 *  컴퓨터책 대여수입
 *  ---> 10300
 *  소설책 대여수입
 *  ---> 7200
 *  만화책 대여수입
 *  ---> 2000
 */


public class Prob002_ArrayList {

	public static void main(String[] args) {
		ArrayList<BookDTO> bookList = new ArrayList<BookDTO>();
		bookList.add(new BookDTO("Java Programming", "컴퓨터", 1400));
		bookList.add(new BookDTO("SQL Programming", "컴퓨터", 1700));
		bookList.add(new BookDTO("Servlet Programming", "컴퓨터", 2300));
		bookList.add(new BookDTO("JDBC Programming", "컴퓨터", 700));
		bookList.add(new BookDTO("EJB Programming", "컴퓨터", 4200));
		bookList.add(new BookDTO("아버지", "소설", 1500));
		bookList.add(new BookDTO("고등어", "소설", 1700));
		bookList.add(new BookDTO("논리야 놀자", "소설", 1700));
		bookList.add(new BookDTO("개미", "소설", 1300));
		bookList.add(new BookDTO("찔레꽃", "소설", 1000));
		bookList.add(new BookDTO("톰 과 제리", "만화", 2000));

		System.out.println("컴퓨터책 대여수입");
		System.out.println("---> " + BookManager.getRentalPrice(bookList, "컴퓨터"));
		
		System.out.println("소설책 대여수입");
		System.out.println("---> " + BookManager.getRentalPrice(bookList, "소설"));
		
		System.out.println("만화책 대여수입");
		System.out.println("---> " + BookManager.getRentalPrice(bookList, "만화"));

	}// end main()
	
	

}// end class
