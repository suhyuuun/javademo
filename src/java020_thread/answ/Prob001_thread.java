package java020_thread.answ;

public class Prob001_thread {

	public static void main(String[] args) {
		VendingMachine vm = new VendingMachine();

		Producer p = new Producer(vm);
		Consumer c = new Consumer(vm);

		Thread t1 = new Thread(p, "생산자");
		Thread t2 = new Thread(c, "소비자");

		t1.start();
		t2.start();

	}

}
