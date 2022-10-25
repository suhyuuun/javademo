package java018_collection.prob;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Scanner;

/*
 * LinkedList
 * 1 List : 순서적으로 데이터를 저장
 * 2 Stack : LIFO
 * 3 Queue : FIFO
 */

public class Prob001_LinkedList {

	public static void main(String[] args) {
		/*
		 * booklist.txt파일의 데이터를 Stack으로 처리하여 출력되도록 
		 * 프로그램을 구현하시오.
		 *  title             	publisher   writer     price
		 	JSP Programming  	JSPPub     JSPExpert   21000
			Servlet Programming WeBBest 	GoodName	 20000
			JDBC Programming 	JDBCBest 	NaDo SQL 	30000
			SQL Fundmental 		SQLBest		 Na SQL 	47000
			Java Programming 	JavaBest	 Kim kava	 25000
		 */
		LinkedList<Book> stack = new LinkedList<Book>();
		try(Scanner sc = new Scanner(new File("./src/java018_collection/prob/booklist.txt"))){
			while(sc.hasNextLine()) {
			String[] line = sc.nextLine().split("/");
			Book book = new Book(line[0],line[1], line[2], line[3]);
			stack.push(book);
			}
		}catch(FileNotFoundException ex) {
			System.out.println(ex.toString());
		}
		System.out.println(" title publisher writer price");
		while(!stack.isEmpty()) {
			Book book = stack.pop();
			System.out.printf("%s %s %s %s\n",book.getTitle(), book.getPublisher(), book.getWriter(), book.getPrice());
		}
		
//		Scanner sc = null;
//		try {
//			sc = new Scanner(new File ("src/java018_collection/prob"));
//			while(sc.hasNextLine()) {
//			String[] line = sc.nextLine().split("/");
//			Book bk = new Book(line[0],line[1], line[2], line[3]);
//			bk.setTitle(line[0]);
//			bk.setPublisher(line[1]);
//			bk.setWriter(line[2]);
//			bk.setPrice(line[3]);
//			nStack.push(bk.getTitle());
//			nStack.push(bk.getPublisher());
//			nStack.push(bk.getWriter());
//			nStack.push(bk.getPrice());
//			}
//			
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}
//		
//		System.out.println("title             	publisher   writer     price");
//		System.out.println(nStack.pop());
	
	}//end main()

}//end class











