package java009_inheritance.part10;

public class Java101_inheritance {

	public static void main(String[] args) {
		BasicTv btv = new BasicTv();
		btv.isPowerOn = true;
		btv.channel = 8;
		btv.volume = 10;
		btv.display();
		
		SmartTv stv = new SmartTv();
		stv.isPowerOn = true;
		stv.channel = 10;
		stv.volume = 15;
		stv.ip = "192.68.24.1";
		stv.display();
	}

}
