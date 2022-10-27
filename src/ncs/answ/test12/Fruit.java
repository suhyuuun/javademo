package ncs.answ.test12;

public class Fruit {

	private String name;
	private int price;
	private int quantity;
	
	public Fruit() {} 
	
	
	public Fruit(String name, int price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		
	}

    @Override
	public String toString() {
		return name + ", " + price + "원," + quantity + "개";
	}


	public String getName() {
		return name;
	}


	public int getPrice() {
		return price;
	}


	public void setName(String name) {
		this.name = name;
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
	
	
}
