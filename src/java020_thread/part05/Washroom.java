package java020_thread.part05;

//공유자원
public class Washroom {
	//synchronized : 동기화 / 하나의 스레드가 공유자원에 입장시 다른 스레드는 입장하지 않음
	synchronized void openDoor(String name) { 
		System.out.println(name + "님이 입장");
		for (int i = 0; i < 50000; i++) {
			if (i % 10000 == 0) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(name + "님이 업무 보는 중");
			} // end if
		} // end for
		System.out.println(name + "님이 퇴장");
	}// end openDoor()
}// end class
