package java020_thread.part01;
/*
동기화            비동기화
StringBuilder   StringBuffer
Vector          ArrayList
Hashtable       HashMap

파일 : Ms-word프로그램
프로세스: 메모리에서 실행중인 프로그램이다.
게임프로그램-게임, 음악, 채팅
스레드(thread) : 프로세스에서 독립적으로 실행되는 단위이다.

자바에서 스레드 생성을 위해 제공해주는 2가지 방법
1. java.lang.Thread클래스
2. java.lang.Runnable 인터페이스

스케줄링
: 스레드가 생성되어 실행될 때 시스템의 여러 자원을 해당 스레드에게 
    할당하는 작업

선점형 스케줄링
 :하나의 스레드가 cpu을 할당받아 실행하고 있을 때 우선순위가
    높은 다른 스레드가 cpu를 강제로 빼앗아가 사용할 수 있는 스케줄링 
  기법이다.
*/
public class Java212_thread {

	public static void main(String[] args) {
		User us = new User();
		//us.run(); //thread로 돌아가는 게 아님 run()메소드 호출한거임
		us.start(); //main thread와 us thread 2개가 돌아감 독립적으로 돌아감
		for(int j = 0; j<=5; j++) {
			System.out.printf("%s j=%d\n",Thread.currentThread(),j); //Thread.currentThread() : 현재 돌아가는 thread에 대한 정보가 나옴
		}
	}

}
