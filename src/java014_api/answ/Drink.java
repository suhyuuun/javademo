package java014_api.answ;

public class Drink {
	private String name;
	private int price;
	private int count;

	public Drink() {

	}

	public Drink(String name, int price, int count) {
		super();
		this.name = name;
		this.price = price;
		this.count = count;
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

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
	public void display(){
		System.out.println("*****음료수 주문****");
		System.out.printf("고객님은 음료수 %s,%d개를 주문하셨습니다.\n",name,count);
		System.out.printf("지불하실 금액은 %d원 입니다.\n\n",price*count);
		
	}

}// end Drink
