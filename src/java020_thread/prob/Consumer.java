package java020_thread.prob;

public class Consumer extends Thread{

	public Consumer() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void run() {
		for(int i = 0; i<=10;i++) {
		System.out.printf("소비자 : % 자판기에 넣기",getName());
		}
	}
}
