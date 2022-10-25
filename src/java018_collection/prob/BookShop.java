package java018_collection.prob;

//디폴트생성자, 인자2개받는 생성자, getter&setter
public class BookShop {
	private String title;
	private String author;
	private int page;
	
	public BookShop() {
		super();
	}
	public BookShop(String title, String author, int page) {
		super();
		this.title = title;
		this.author = author;
		this.page = page;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
}
