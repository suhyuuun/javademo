package java020_thread.prob;

public class EnglishLowerThread extends Thread{
	char []arr = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

	public void run() {
		for(char engL : arr) {
			System.out.print(engL);
			try {
				sleep(30);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}//end for
		}//end run()
}
