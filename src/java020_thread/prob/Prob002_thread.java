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
		
		

	}//end main()

}//end class
