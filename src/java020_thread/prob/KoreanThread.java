package java020_thread.prob;

public class KoreanThread extends Thread{
	char[] arr = { 'ㄱ', 'ㄴ', 'ㄷ', 'ㄹ', 'ㅁ', 'ㅂ', 'ㅅ', 'ㅇ', 'ㅈ', 'ㅊ', 'ㅋ', 'ㅌ', 'ㅍ', 'ㅎ' };

	public void run() {
	for(char kr : arr) {
		System.out.print(kr);
		try {
			sleep(30);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}//end for
	}//end run()
}//end class
