package java002_statements.answ;

/*
 * switch~case문을 이용해서 메뉴의 가격을 제공해주는 프로그램을 구현하시오.
 * 1 [조건]
 *   code변수의 값이 'A'일때  price=7500,menu="짬뽕"
 *   code변수의 값이 'B'일때  price=6000,menu="만두"
 *   code변수의 값이 'C'일때  price=5000,menu="짜장"
 *   code변수의 값이 'D'일때  price=4000,menu="라면"
 * 
 * 2 [출력결과]
 *  code의 값이 'A' 일때 => 짬뽕메뉴 가격은 7500원입니다.
 *  code의 값이 'B' 일때 => 만두메뉴 가격은 6000원입니다.
 *  code의 값이 'C' 일때 => 짜장메뉴 가격은 5000원입니다.
 *  code의 값이 'C' 일때 => 라면메뉴 가격은 4000원입니다.
 *  code의 값이  A,B,C,D가 아닐때 => 제공하지 않는 메뉴입니다.
 */

public class Prob02 {

	public static void main(String[] args) {
		char code = 'A';
		String menu = "";
		int price = 0;

		// switch~case문을 이용해서 프로그램을 코딩하시요.
		switch (code) {
		case 'A':
			price = 7500;
			menu = "짬뽕";
			break;
		case 'B':
			price = 6000;
			menu = "만두";
			break;
		case 'C':
			price = 5000;
			menu = "짜장";
			break;
		case 'D':
			price = 4000;
			menu = "라면";
			break;
		default:
			System.out.println("제공하지 않는 메뉴입니다");
			return;
		}

		System.out.printf("%s메뉴 가격은 %d원입니다.", menu, price);

	}// end main()

}// end class
