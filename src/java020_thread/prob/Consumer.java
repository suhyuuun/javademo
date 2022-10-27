package java020_thread.prob;

public class Consumer extends Thread{
	private VendingMachine vm;
	public Consumer(VendingMachine vm) {
		this.vm = vm;
	}
	
	@Override
	public void run() {
		for(int i = 1; i<=10;i++) {
		System.out.println(Thread.currentThread().getName()+" : " +vm.getDrink()+"꺼내옴");
		}
	}
}
