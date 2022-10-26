package java020_thread.prob;

public class VendingMachine {
	private String drink;

	public String getDrink() {
		return drink;
	}
	
	synchronized public void putDrink(String drink) {
		System.out.println();
	}
	
	
}
