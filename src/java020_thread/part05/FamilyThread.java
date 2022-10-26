package java020_thread.part05;

public class FamilyThread extends Thread {
	private Washroom wr;
	private String who;

	public FamilyThread() {
		// TODO Auto-generated constructor stub
	}

	public FamilyThread(Washroom wr, String who) {
		this.wr = wr;
		this.who = who;
	}

	@Override
	public void run() {
		wr.openDoor(who);
	}
}
