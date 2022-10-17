package java010_abstract_interface.prob.part01;

/* [주의]테스트할때 main( )메소드의 주석을 해제하세요.
 * MyPoint클래스를 상속받아 아래와 같이 출력이 되도록
 * MyColorPoint클래스를 구현하세요.
 * 
 * [출력결과]
 * 3,2,blue
 */

public class Prob001_abstract {

	public static void main(String[] args) {
		// 테스트할때 아래 주석을 해제하세요.
		
		  MyPoint p = new MyColorPoint(2,3,"blue"); 
		  
		  p.reverse();
		   
		  p.show();// 이 메소드의 실행 결과 "3,2,blue"가 출력된다.
		 
		
		

	}// end main()

}// end class
