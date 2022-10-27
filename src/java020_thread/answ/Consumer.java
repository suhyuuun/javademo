package java020_thread.answ;

public class Consumer implements Runnable {
	private VendingMachine vm;

	public Consumer(VendingMachine vm) {
		this.vm = vm;
	}

	@Override
	public void run() {
		for(int i=1; i<=10; i++){
			System.out.println(Thread.currentThread().getName()+" : "+vm.getDrink() +" 꺼내옴");
			
			/*try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}*/
		}

	}//end run()

}//end class
