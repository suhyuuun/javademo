package java020_thread.part01;
//단일상속은 class에서 class를 할때를 의미
public class User extends Thread{
	public User() {
		
	}
	
	@Override
	public void run() {
		//Thread으로 실행할 문장을 구현
		for(int i= 0; i<=5;i++) {
			System.out.printf("%s i=%d\n",getName(),i); 
			//getName() : thread class에서 제공함 /thread의 이름
		}
	}
}//end class
