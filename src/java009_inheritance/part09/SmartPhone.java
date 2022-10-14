package java009_inheritance.part09;

public class SmartPhone extends HandPhone{
	private String number;
	private String type; //KT, LG, SKT
	
	public SmartPhone() {
		
	}

	public SmartPhone(String maker, String model, int price, String number, String type) {
		super(maker, model, price);
		this.number = number;
		this.type = type;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public String toString() {
		return String.format("%-4s %-10s %6d %s %s", getMaker(),getModel(),getPrice(),getNumber(),getType());
	}
	
	
}
