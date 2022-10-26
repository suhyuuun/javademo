package java019_inner.part01;

public class OuterInstance {
	private int num;
	private int data;
	
	public void display() {
		System.out.println("display");
	}//end display()
	
	class InnerInstance{
		public void run() {
			num = 10;
			System.out.println(num);
		}//end run()
	}//end InnerStance class
}//end class
