package ncs.answ.test15;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class BookListTest {

	public static void main(String[] args) {
		ArrayList<Book> list = new ArrayList<Book>();

		storeList(list);
		saveFile(list);

		List<Book> booksList = loadFile();
		printList(booksList);

	}

	public static void printList(List<Book> list) {
		for (Book book : list) {
			int sum = (int) (book.getPrice() - book.getPrice() * book.getDiscountRate());
			System.out.println(book);
			System.out.println("할인된 가격 : " + sum + "원");
		}
	}

	public static void storeList(ArrayList<Book> list) {		
		//Book[] qw = new Book[3];
		//qw[0] = new Book("자바의 정석", "남궁성", 30000, "도우출판", 0.15);
		//qw[1] = new Book("열혈강의 자바", "구정은", 29000, "프리렉", 0.2);
		//qw[2] = new Book("객체지향 JAVA8", "금영욱", 30000, "북스홈", 0.1);

		list.add(new Book("자바의 정석", "남궁성", 30000, "도우출판", 0.15));
		list.add(new Book("열혈강의 자바", "구정은", 29000, "프리렉", 0.2));
		list.add(new Book("객체지향 JAVA8", "금영욱", 30000, "북스홈", 0.1));
	}

	public static void saveFile(ArrayList<Book> list) {
		File file = new File("./src/ncs/answ/test15/books.dat");

		FileOutputStream fs = null;
		ObjectOutputStream os = null; //객체를 파일에 저장하기위한 스트림

		try {
			fs = new FileOutputStream(file);
			os = new ObjectOutputStream(fs);

			for (int i = 0; i < list.size(); i++) {
				os.writeObject(list.get(i));
			}
			
			//System.out.println("저장 완료");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				os.close();
				fs.close();
			} catch (IOException e) {			
				e.printStackTrace();
			}
		}
	}

	public static List<Book> loadFile() {
		File file = new File("./src/ncs/answ/test15/books.dat");

		FileInputStream fi = null;
		ObjectInputStream oi = null;
		ArrayList<Book> list = null;
		try {
			fi = new FileInputStream(file);
			oi = new ObjectInputStream(fi);

			
			list = new ArrayList<Book>();
			Object bk = null;
			while((bk=oi.readObject())!=null) {	
				
			  list.add((Book)bk);
			}
			//System.out.println("읽기 완료");
		} catch (NullPointerException e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
		
		} catch (ClassNotFoundException e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
		} catch(EOFException e) {
			//System.out.println("file end");
		} catch (IOException e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}finally {
			try {
				oi.close();
				fi.close();
			} catch (IOException e) {
				//e.printStackTrace();
				System.out.println(e.getMessage());
			}
			
		}
		return list;
	}
}
