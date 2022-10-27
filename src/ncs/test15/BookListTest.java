package ncs.test15;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import ncs.answ.test15.Book;

public class BookListTest {

	public static void main(String[] args) {
		ArrayList<Book> list = new ArrayList<Book>();

		storeList(list);
		saveFile(list);

		List<Book> bookList = loadFile();
		printList(bookList);
	}

	public static void printList(List<Book> list) {
		for (Book book : list) {
			int sum = (int) (book.getPrice() - book.getPrice() * book.getDiscountRate());
			System.out.println(book);
			System.out.println("할인된 가격 : " + sum + "원");
		}
	}

	public static void storeList(ArrayList<Book> list) {
		list.add(new Book("자바의 정석", "남궁성", 30000, "도우출판", 0.15));
		list.add(new Book("열혈강의 자바", "구정은", 29000, "프리렉", 0.2));
		list.add(new Book("객체지향 JAVA8", "금영욱", 30000, "북스홈", 0.1));
	}

	public static void saveFile(ArrayList<Book> list) {
		File file = new File("./src/ncs/test15/books.dat");

		FileOutputStream fs = null;
		ObjectOutputStream os = null; 

		try {
			fs = new FileOutputStream(file);
			os = new ObjectOutputStream(fs);

			for (int i = 0; i < list.size(); i++) {
				os.writeObject(list.get(i));
			}
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
		File file = new File("./src/ncs/test15/books.dat");

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
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				oi.close();
				fi.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
		return list;
	}

}
