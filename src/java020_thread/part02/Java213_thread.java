package java020_thread.part02;

public class Java213_thread {

	public static void main(String[] args) {
		UserImp um = new UserImp();
		Thread th = new Thread(um);
		th.start();
		for(int j = 0; j<=5; j++) {
			System.out.printf("%s j=%d\n",Thread.currentThread(),j); //Thread.currentThread() : 현재 돌아가는 thread에 대한 정보가 나옴
		}
	}

}
