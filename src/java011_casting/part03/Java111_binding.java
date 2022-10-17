package java011_casting.part03;

public class Java111_binding {

	public static void main(String[] args) {
		LgTv lg = new LgTv("LG");
		process(lg);
		
		SamsungTv ss = new SamsungTv("SAMSUNG");
		process(ss);
	}

	//결합도(의존성)이 높다 -> 유지보수가 높고 확장성이 약하다.
	//객체지향 응집도는 높이고 결합도를 낮춰야 함
	//결합도를 낮추기 위해 interface를 사용하거나 Java110과 같은 방법 사용
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
