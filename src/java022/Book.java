package java022;

public class Book {
	String title;
	int price;
	
	public Book() {
		// TODO Auto-generated constructor stub
	}
	
	public Book(String title, int price) {
		this.title = title;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return String.format("%s %d", title, price);
	}
}
