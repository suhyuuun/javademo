package java020_thread.answ;

import java.util.Stack;

/* wait()와 notify()를 이용하여 완성

Stack store=new Stack();

pop()   :  꺼냄 
push()  :  넣기
*/
public class VendingMachine {
	Stack<String> store = new Stack<String>();

	public synchronized String getDrink() {
		//System.out.println(Thread.currentThread().getName());
		while (store.isEmpty()) {
			try {				
			  wait();				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		return store.pop().toString();
	}

	// For producer(생산)
	public synchronized void putDrink(String drink) {		
		store.push(drink);
		notifyAll();
		
	}
}
