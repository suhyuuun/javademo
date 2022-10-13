package java006_class.prob;
/*
 * draw()메소드를   [실행결과]를 참조하여 구현하세요.
 * 
 * [실행결과]
 * &&&&&&&&&&
 * %%%%%%%%%%%%%%%%%%%%
 * %%%%%%%%%%%%%%%%%%%%
 * %%%%%%%%%%%%%%%%%%%%
 */



public class Prob03_class {

	public static void main(String[] args) {
		//여기를  구현하세요.
		Box a = new Box();
		Box b = new Box(20,3);
		
		a.fill('&');
		a.draw();
		b.fill('%');
		b.draw();
		

	}//end main()

}//end class
