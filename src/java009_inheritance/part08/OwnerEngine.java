package java009_inheritance.part08;

public class OwnerEngine extends Car{
	private int seat;
	
	public OwnerEngine() {
	}
	
	public void setSeat(int seat) {
		this.seat = seat;
	}
	
	void information() {
		System.out.println(seat + "인승 차량입니다");
	}
	

}
