package java020_thread.answ;

public class Producer implements Runnable{
	private VendingMachine vm;
	
	public Producer(VendingMachine vm){
		this.vm=vm;
	}
	
	@Override
	public void run() {
		for(int i=1; i<=10; i++){
			System.out.println(Thread.currentThread().getName() +" : 음료수 No. "+i+"넣음");
			vm.putDrink("음료수 No. "+i);
			try {
				Thread.sleep(500);//0.5
			} catch (InterruptedException e) {
				e.printStackTrace();
			}	
		}
		
	}//end run()
	
}//end class




