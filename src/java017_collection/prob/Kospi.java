package java017_collection.prob;

public class Kospi {
	private String stock ; //주가항목
	private long price; //현재가격
	private String fluctuation ; //등락
	
	public Kospi(String stock, long price, String fluctuation) {		
		this.stock = stock;
		this.price = price;
		this.fluctuation = fluctuation;
	}

	public String getStock() {
		return stock;
	}

	public void setStock(String stock) {
		this.stock = stock;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	public String getFluctuation() {
		return fluctuation;
	}

	public void setFluctuation(String fluctuation) {
		this.fluctuation = fluctuation;
	}
}
