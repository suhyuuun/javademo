package java020_thread.prob;

public class Producer extends Thread{

	public Producer() {
		
	}
	@Override
	public void run() {
		for(int i = 0; i<=10;i++) {
		System.out.printf("생산자 : 음료수 %s 자판기에 넣기",getName());
		}
	}
}
