package java020_thread.answ;

public class EnglishLowerThread extends Thread{
	char[] arr={'a','b','c','d','e','f','g','h','i','j','k','l','m','n',
            'o','p','q','r','s','t','u','v','w','x','y','z'};
	
	@Override
	public  void run(){
		for(char ch : arr){
			System.out.print(ch);
			try {
				sleep(30);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
