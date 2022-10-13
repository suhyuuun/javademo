package java007_class.part05;

public class CreditCard {
	String cardName;
	String cardNum;
	int pay;
	
	public CreditCard() {} //ctrl + spacebar

	public CreditCard(String cardName, String cardNum, int pay) {
		this.cardName = cardName;
		this.cardNum = cardNum;
		this.pay = pay;
	}
	
	public String toString() {
		return String.format("%s %s %d", cardName, cardNum, pay);
	}
	
}
