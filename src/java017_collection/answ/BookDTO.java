package java017_collection.answ;

public class BookDTO {
	private String title;
	private String kind;
	private int rentalPrice;
	
	public BookDTO() {
		// TODO Auto-generated constructor stub
	}
	
	public BookDTO(String title, String kind, int rentalPrice) {
		this.title = title;
		this.kind = kind;
		this.rentalPrice = rentalPrice;
	}

	
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public int getRentalPrice() {
		return rentalPrice;
	}

	public void setRentalPrice(int rentalPrice) {
		this.rentalPrice = rentalPrice;
	}
	
}
