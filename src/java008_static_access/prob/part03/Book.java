package java008_static_access.prob.part03;

/*
 *  -title:String
 *  -author:String
 *  -page:int
 *  
 *  +Book()
 *  +Book(title:String, author:String, page:int)
 *  +setter & getter
 *  +toString():String
 */
public class Book{
	private String title;
	private String author;
	private int page;
	
	public Book() {
		
	}

	public Book(String title, String author, int page) {
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
	
	public String toString() {
		return String.format("%s의 저자는 %s이고 %d페이지로 구성됨", title, author, page);
	}
}







