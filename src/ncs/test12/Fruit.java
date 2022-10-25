package ncs.test12;

public class Fruit {
	private String name;
	private int price;
	private int quantitiy;

	public Fruit() {

	}

	public Fruit(String name, int price, int quantitiy) {
		this.name = name;
		this.price = price;
		this.quantitiy = quantitiy;
	}

	@Override
	public String toString() {
		return super.toString();
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

	public int getQuantitiy() {
		return quantitiy;
	}

	public void setQuantitiy(int quantitiy) {
		this.quantitiy = quantitiy;
	}

}
