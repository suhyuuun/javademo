package java020_thread.part02;

public class UserImp implements Runnable{

	public UserImp() {

	}
	
	@Override
	public void run() {
		for(int i= 0; i<=5;i++) {
			System.out.printf("%s i=%d\n",Thread.currentThread().getName(),i); 
			//runnable에는 run만 있어서 Thread.currentThread()를 사용하여 getName()불러옴
		}
	}
}
