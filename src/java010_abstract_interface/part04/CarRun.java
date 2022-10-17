package java010_abstract_interface.part04;

public interface CarRun {
	int carcount = 5; //public static final carCount = 5;
	//public CarRun() {} 불가
	//static {System.out.println("CarRun");} 불가
	void prn(); //public abstract void prn();
	//void display(); 불가
	class Sun{ //public static class Sun{
		public Sun() {
			System.out.println("Sun Constructor");
		}
	} //클래스안에 클래스 정의불가 인터페이스 안에 클래스 정의가능
	
}