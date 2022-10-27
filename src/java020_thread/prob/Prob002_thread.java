package java020_thread.prob;
/*
 * [출력화면]	 
 * abcdefghijklmnopqrstuvwxyz
 * ABCDEFGHIJKLMNOPQRSTUVWXYZ
 * ㄱㄴㄷㄹㅁㅂㅅㅇㅈㅊㅋㅌㅍㅎ
 */
public class Prob002_thread {

	public static void main(String[] args) {
		EnglishLowerThread t1=new EnglishLowerThread();
		EnglishUpperThread t2=new EnglishUpperThread();
		KoreanThread t3=new KoreanThread();
		
		try {
			t1.start();
			t1.join();
		}catch(InterruptedException e){}
		System.out.println();
		try{
			t2.start();
			t2.join();
		}catch(InterruptedException e){}
		System.out.println();
		try{
			t3.start();
			t3.join();
		}catch(InterruptedException e){}
	

	}//end main()

}//end class
