package java013_api;

import java.util.Scanner;

/*
 * 단입력 : 5
 * 5 X 1 = 5
 * 5 X 2 = 10
 * ...
 * 5 X 9 = 45
 * 계속하시겠습니까? (종료: n, 계속: 아무키) n
 * 프로그램 종료
 */
public class Java143_Scanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//선생님 풀이
		while(true) { //프로그램이 정확히 언제끝날지 모르는 상황에 사용 
			System.out.print("단입력: ");
			int dan = sc.nextInt();
			for(int i = 1;i<10;i++) {
				System.out.printf("%d X %d = %d\n",dan, i, dan*i);
			}
			System.out.print("계속하시겠습니까?(종료: n, 계속: 아무 키):");
			String chk = sc.next();
			if(chk.equals("n")) {
				break;
			}
		}
		System.out.println("프로그램종료");
		
		//김수현 풀이
//		System.out.print("단입력: ");
//		int dan = sc.nextInt();
//		for(int i = 1;i<=9;i++) {
//			System.out.printf("%d X %d = %d\n",dan, i, dan*i);
//		}
//		System.out.print("계속하시겠습니까?(종료: n, 계속: 아무 키)");
//		String exit = sc.next();
//		if(exit == "n") //문자열이기 때문에 주소를 비교해서 false로 나옴
//			System.out.println("프로그램종료");
//		else {
//			System.out.print("단입력: ");
//			dan = sc.nextInt();
//			for(int i = 1;i<=9;i++) {
//				System.out.printf("%d X %d = %d\n",dan, i, dan*i);
//			}
//		}
		

	}//end main()

}//end class
