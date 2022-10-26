package java020_thread.part03;

public class Java213_thread {

	public static void main(String[] args) {
		LifeCycle cc = new LifeCycle();
		System.out.println(cc.getState()); // NEW
		
		cc.start(); //RUNNABLE (running 상태는 찍어볼수없음)
		
		try {
			//join()안에 시간지정가능 1000 -> 1초
			//지정된 시간동안 스레드가 실행되도록 한다.
			//지정된 시간이 지나거나 종료가 되면 join()을 호출한 스레드로 다시 돌아와 실행을 계속한다.
			cc.join(); //main thread가 cc thread가 다 돌아갈때까지 기다림
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(cc.getState()); // TERMINATED
		System.out.println("main end");

	}//end main()

}//end class
