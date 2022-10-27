package ncs.answ.test13;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Inventory {
	private String productName;
	private Date putDate;
	private Date getDate;
	private int putAmount;
	private int getAmount;
	private int inventoryAmount;

	public Inventory() {
	}

	public Inventory(String productName, Date date, int putAmount) {
		
		this.productName = productName;		
		this.putDate = date;
		//this.getDate=date;
		this.putAmount = putAmount;
		this.inventoryAmount = putAmount;	
	}
	
	
	public String toString() {
		 
		SimpleDateFormat sd = new SimpleDateFormat("yyyy년 M월 dd일");
		String rdate = getDate==null? null : sd.format(getDate);
		return String.format("%s, %s 입고, %d개, %s, %d개, 재고 %d개",productName, sd.format(putDate), putAmount,rdate, getAmount, inventoryAmount);
		
	}

	public String getProductName() {
		return productName;
	}

	public Date getPutDate() {
		return putDate;
	}

	public Date getGetDate() {
		
		return getDate;
	}

	public int getPutAmount() {
		return putAmount;
	}

	public int getGetAmount() {
		return getAmount;
	}

	public int getInventoryAmount() {
		return inventoryAmount;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public void setPutDate(Date putDate) {
		this.putDate = putDate;
	}

	public void setGetDate(Date getDate) {
		
		this.getDate = getDate;
	}

	public void setPutAmount(int putAmount) {
		this.putAmount = putAmount;
	}

	public void setGetAmount(int getAmount) {
		try {
			if (this.getInventoryAmount() < getAmount) {
				throw new AmountNotEnough("현재 재고가 부족합니다. 재고수량확인하시기 바랍니다.");
			}
			else {
				this.getAmount = getAmount;
			    this.inventoryAmount -= getAmount;
			}

		} catch (AmountNotEnough e) {
			System.out.println("출고수량 부족시--------------------------------");
			System.out.println(e.getMessage());
			//System.out.println(e.toString());			
			//e.printStackTrace();
			
			//시스템 강제종료
			System.exit(0);
		}
	}

	public void setInventoryAmount(int inventoryAmount) {
		this.inventoryAmount = inventoryAmount;
	}

}
