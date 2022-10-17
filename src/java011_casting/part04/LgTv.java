package java011_casting.part04;

public class LgTv extends HomeTv{
	String maker;
	public LgTv() {
		
	}
	
	public LgTv(String maker) {
		super(maker);
		
	}
	
	public void call() {
		System.out.println("LG call");
	}
	
	
}
