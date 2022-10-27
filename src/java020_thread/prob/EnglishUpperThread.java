package java020_thread.prob;

public class EnglishUpperThread extends Thread{
char []arr = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};

	public void run() {
		for(char engU : arr) {
			System.out.print(engU);
			try {
				sleep(30);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}//end for
		}//end run()
}//end class
