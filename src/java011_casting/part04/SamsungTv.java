package java011_casting.part04;

public class SamsungTv extends HomeTv{
	String maker;
	
	public SamsungTv() {
		
	}
	
	public SamsungTv(String maker) {
		super(maker);
		
	} 
	
	public void move() {
		System.out.println("Samsung move");
	}
}
