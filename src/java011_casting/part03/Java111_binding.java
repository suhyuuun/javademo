package java011_casting.part03;

public class Java111_binding {

	public static void main(String[] args) {
		LgTv lg = new LgTv("LG");
		process(lg);
		
		SamsungTv ss = new SamsungTv("SAMSUNG");
		process(ss);
	}

	//결합도(의존성)이 높다 -> 유지보수가 높고 확장성이 약하다.
	public static void process(SamsungTv tv) {
		tv.turnOff();
		tv.turnOn();
		tv.soundDown();
		tv.soundUp();
		tv.move();
	}
	
	public static void process(LgTv tv) {
		tv.turnOff();
		tv.turnOn();
		tv.soundDown();
		tv.soundUp();
		tv.call();
	}
}
