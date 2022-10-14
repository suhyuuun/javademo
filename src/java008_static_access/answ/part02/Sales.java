package java008_static_access.answ.part02;

//-(private)    + (public)    #(protected)     X : default

/*   클래스명 : Sales
*   -item:String  private String item;
*   -qty:int
*   -cost:int
*   
*   +setItem(item String):void
*   +setQty(qty int):void
*   +setCost(cost int):void
*   +getItem():String
*   +getQty():int
*   +getCost():int
*   +toString():String         ==> 출력
*   +getPrice():int             ==> 수량 * 단가를 리턴
*/
public class Sales {
	private String item;
	private int qty;
	private int cost;

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "품목 : " + item + "\n수량 : " + qty + "개\n단가 : " + cost + "원\n금액 : " + getPrice() + "원";
	}

	public int getPrice() {
		return qty * cost;
	}
}