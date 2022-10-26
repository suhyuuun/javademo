package java020_thread.part03;
/*
 *	스레드 생명주기(Thread Life Cycle)
 *	start() - 실행준비상태(RUNNABLE) - run() - TERMINATED(Dead)
 *								   sleep(시간),        wait() -> 대기상태(WAITING)
 *								   1000 ->1초이후에 실행  직접 깨워야함(notify, notifyAll사용)
 */
public class LifeCycle extends Thread{
	public LifeCycle() {
		
	}//end LifeCycle()
	
	@Override
	public void run() {
		System.out.println(getState()); //thread에서 getState() 정의되어있음 getState() : 현재 thread의 상태
	}
}
