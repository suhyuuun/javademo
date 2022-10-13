package java007_class.prob.part01;

public class MovieShop {
	String name;
	int price;
	int person;

	public MovieShop() {

	}

	public MovieShop(String name, int price, int person) {
		this.name = name;
		this.price = price;
		this.person = person;
	}

	public int countMoney() {
		return price * person;
	}

	public void prn() {
		System.out.printf("%s %d\n", name, countMoney());
	}
}//end class
