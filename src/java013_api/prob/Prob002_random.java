package java013_api.prob;

import java.util.Random;

/*
 * [문제]
 * 1~20 사이의 난수 10개를 발생시켜 배열에 저장한 후에 리턴하는 
 * makeArray() 메서드와 생성된 배열에서 중복된 숫자를 제거하고 
 * 유일한 숫자만 출력하는 printUniqueNumber() 메서드를 각각 구현하시오.
 * 
 * [프로그램 실행결과]
 * << 발생된 난수 >>
 *  15 7  4  4  8  7  1  11  17  5 
 *  << 중복되지 않은 유일한 숫자 >>
 *  15 8  1  11  17  5

 */
public class Prob002_random {

	public static void main(String[] args) {
		int[] array = makeArray();
		System.out.println("<< 발생된 난수 >>");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

		System.out.println("\n<< 중복되지 않은 유일한 숫자 >>");
		printUniqueNumber(array);
	}// end main()

	private static int[] makeArray() {
		// 난수값를 발생시킨후 반환하는 프로그램을 구현하시오.
		
		
		return null;
	}// end makeArray()

	private static void printUniqueNumber(int[] array) {
		// array배열에서 중복되지 않은 유일한 숫자만을 출력하는 프로그램을 구현하시오.		
		
			

	}// end printUniqueNumber()
}// end Prob04











