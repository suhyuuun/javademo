package java009_inheritance.part10;

public class BasicTv {
	boolean isPowerOn;
	int channel;
	int volume;
	
	public BasicTv() {
		
	}
	
	public void display() {
		System.out.println("---TV 현재 상태---");
		System.out.println("전원:" + isPowerOn);
		System.out.println("채널:" + channel);
		System.out.println("볼륨:" + volume);
	}
}
