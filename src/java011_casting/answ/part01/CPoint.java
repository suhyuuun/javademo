package java011_casting.answ.part01;

public class CPoint {
	private int x, y;

	public CPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void show() {
		System.out.println("(" + x + "," + y + ")" + other());
	}

	protected String other() {
		return "";
	}

	public String toString() {
		return "(" + x + "," + y + ")" + "입니다";
	}
}//end class
