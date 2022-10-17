package java011_casting.part04;

public class Java112_binding {

	//결합도(의존도)가 낮아졌다. 객체간의 결합도를 낮추는 것이 중요함
	public static void process(HomeTv tv) {
		tv.turnOn();
		tv.soundUp();
		
		if(tv instanceof SamsungTv) {
			SamsungTv stv = (SamsungTv)tv;
			stv.move();
		}else if(tv instanceof LgTv) {
			LgTv ltv = (LgTv)tv;
			ltv.call();
		}
	}
	
	public static void main(String[] args) {
		LgTv lg = new LgTv("LG");
		process(lg);
		
		SamsungTv ss = new SamsungTv("SAMSUNG");
		process(ss);

	}//end main()

}//end class
