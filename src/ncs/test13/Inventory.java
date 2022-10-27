package ncs.test13;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Inventory {
	private String productName; //상품명
	private Date putDate; //입고일
	private Date getDate; //출고일
	private int putAmount; //입고수량
	private int getAmount; //출고수량
	private int inventoryAmount; //재고수량
	
	public Inventory() {
		
	}

	public Inventory(String productName, Date date, int putAmount) {
		this.productName = productName;
		this.putDate = date;
		this.putAmount = putAmount;
		this.inventoryAmount = putAmount;
	}
	
	@Override
	public String toString() {
		SimpleDateFormat sd = new SimpleDateFormat("yyyy년 M월 dd일");
		String rdate = getDate==null? null : sd.format(getDate);
		return String.format("%s %s 입고, %d개, %s, %d개, 재고 %d개", productName, sd.format(putDate), putAmount,rdate, getAmount, inventoryAmount);
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Date getPutDate() {
		return putDate;
	}

	public void setPutDate(Date putDate) {
		this.putDate = putDate;
	}

	public Date getGetDate() {
		return getDate;
	}

	public void setGetDate(Date getDate) {
		this.getDate = getDate;
	}

	public int getPutAmount() {
		return putAmount;
	}

	public void setPutAmount(int putAmount) {
		this.putAmount = putAmount;
	}

	public int getGetAmount() {
		return getAmount;
	}

	public void setGetAmount(int getAmount) {
		try {
			if(this.getInventoryAmount() < getAmount) {
				throw new AmountNotEnough("현재 재고가 부족합니다. 재고수량확인하시기 바랍니다.");
			}
			else {
				this.getAmount = getAmount;
				this.inventoryAmount -= getAmount;
			}
		}catch(AmountNotEnough e) {
			System.out.println("출고수량 부족시-------------------------------------------------------");
			System.out.println(e.getMessage());
			
			System.exit(0);
		}
	}

	public int getInventoryAmount() {
		return inventoryAmount;
	}

	public void setInventoryAmount(int inventoryAmount) {
		this.inventoryAmount = inventoryAmount;
	}
	
	
	
	
}
