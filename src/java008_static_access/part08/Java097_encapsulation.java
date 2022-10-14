package java008_static_access.part08;

public class Java097_encapsulation {

	public static void main(String[] args) {
		Time time = new Time();
		time.setHour(12);
		time.setMinute(10);
		time.setSecond(20);
		
		System.out.printf("%d:%d:%d\n",time.getHour(),time.getMinute(),time.getSecond());
		System.out.println(time.toString());
	}

}
