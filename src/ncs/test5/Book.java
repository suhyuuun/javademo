package ncs.test5;

public class Book {
	private String title;
	private String author;
	private int price;
	private String publisher;
	private double discountRate;

	public Book() {
		// TODO Auto-generated constructor stub
	}

	public Book(String title, String author, int price, String publisher, double discountRate) {
		this.title = title;
		this.author = author;
		this.price = price;
		this.publisher = publisher;
		this.discountRate = discountRate;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public int getPrice() {
		return price;
	}

	public String getPublisher() {
		return publisher;
	}

	public double getDiscountRate() {
		return discountRate;
	}

	
}
