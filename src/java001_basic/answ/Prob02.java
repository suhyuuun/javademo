package java001_basic.answ;

/*
 * num변수의 절대값을 출력하는 프로그램을 구현하시오.
 * [실행결과]
 * 10
 */

public class Prob02 {

	public static void main(String[] args) {
		int num = -10;
		//여기에 작성하시오.
		int res = num>=0 ? num : num * -1;
		System.out.println(res);
	}

}
