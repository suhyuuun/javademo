package java020_thread.part04;
/*
 * 스레드의 우선순위는 1 ~ 10까지 지정할 수 있다.
 * 스레드의 기본값은 5이다.
 * Thread.MAX_PRIORITY = 10
 * Thread.NORM_PRIORITY = 5
 * Thread.MIN_PRIORITY = 1
 */
public class Java214_thread {

	public static void main(String[] args) {
		PriorityTest t1 = new PriorityTest();
		t1.start();
		//우선순위 값을 넣어주지 않으면 기본값 5
		
		PriorityTest t2 = new PriorityTest();
		//t2.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(10);
		t2.start();
		
		PriorityTest t3 = new PriorityTest();
		t3.setPriority(3);
		t3.start();
		
		PriorityTest t4 = new PriorityTest();
		t4.setName("User");
		t4.start();
		
		PriorityTest t5 = new PriorityTest();
		t5.setPriority(7);
		t5.setName("Test");
		t5.start();
		
	}//end main()

}//end class
