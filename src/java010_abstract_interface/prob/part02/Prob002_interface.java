package java010_abstract_interface.prob.part02;

/*
 * MotorBicycle클래스가 아래와 같이 출력이 되도록 구현하세요.
 * 
 * 
 * [출력결과]
 * ID : 900
 * Brand : Yamaha
 * Frame Size : 16
 * Motor Size : 100
 * ## 모터 start!!
 * ## 모터 stop!!
 */

public class Prob002_interface {

	public static void main(String[] args) {
		MotorBicycle mb = new MotorBicycle();
		mb.id = 900;
		mb.brand = "Yamaha";
		mb.prtInfo();
		mb.start();
		mb.stop();
	}// end main()

}// end class
