package java006_class.prob;

/*1 Office클래스를 이용한 객체를 생성할때 chk멤버변수에 2로 초기값을 할당하시오.
 *   1이면 합격 2이면 불합격
 *   
 * 2 출력결과 
 * 	번호  점수  합격여부
 * 	 1    90       1
 *   2    65       2
 *   3    85       1
 */


public class Prob04_class {

	public static void main(String[] args) {
		// 문제를 풀때는 주석을 해제후 한다.
		Office p1 = new Office(1, 90);
		Office p2 = new Office(2, 65);
		Office p3 = new Office(3, 85);
		System.out.println("번호 점수 합격여부");
		p1.process();
		p2.process();
		p3.process();
	}// end main()

}// end class
