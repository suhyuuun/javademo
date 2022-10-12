package java006_class.prob;

/*피자의 반지름을 10, 도넛의 반지름은 2로 한다.
 * 
 * [실행결과]
 * 자바피자의 면적은 314.0
 * 자바도넛의 면적은 12.56
 */

public class Prob01_class {

	public static void main(String[] args) {
		//여기를 구현하세요.////////////////////	
		Circle ci= new Circle();
		ci.name = "자바피자";
		ci.radius = 10;
		ci.display();
		
		Circle cr= new Circle();
		cr.name = "자바도넛";
		cr.radius = 2;
		cr.display();
	}//end main()

}//end class
