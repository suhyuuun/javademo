package java009_inheritance.prob.part05;

public class Book {
	String bookName; //첵이름
	String author; //작가명
	int price; //정가

	public Book(String bookName, String author, int price) {
		this.bookName = bookName;
		this.author = author;
		this.price = price;
	}
	
	public void display() {
		System.out.printf("책이름: %s, 작가: %s, 정가:%d", bookName, author, price);
	}

}
