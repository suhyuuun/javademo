package java017_collection.answ;
class Book{
	private String title;
	private String publisher;
	private String writer;
	private String price;

	public Book(String title, String publisher, String writer, String price) {
		this.title = title;
		this.publisher = publisher;
		this.writer = writer;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}		
}
