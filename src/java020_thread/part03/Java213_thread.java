package java020_thread.part03;

public class Java213_thread {

	public static void main(String[] args) {
		LifeCycle cc = new LifeCycle();
		System.out.println(cc.getState()); // NEW
		
		cc.start(); //RUNNABLE (running 상태는 찍어볼수없음)
		
		System.out.println("main end");

	}//end main()

}//end class
