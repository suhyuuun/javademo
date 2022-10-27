package ncs.answ.test14;

public class Goods {
	private String name;
	private int price;
	private int quantity;
	
	public Goods() {
		super();
	}

	public Goods(String name, int price, int quantity) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	@Override
	public String toString(){
		return String.format("%s, %d원, %s개",name,price,quantity);
	}
	
}
