package java020_thread.prob;

import java.util.Stack;

public class VendingMachine {
	Stack<String> store = new Stack<String>();

	public synchronized String getDrink() {
		while(store.isEmpty()) {
			try {
				wait();
				}catch(InterruptedException e){
					e.printStackTrace();
				}
		}
		return store.pop().toString();
	}
	
	
	 public synchronized void putDrink(String drink) {
		 store.push(drink);
		 notifyAll();
	}
	
	
}
