package java015_api;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Java157_exception {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] data = new int[2];
		int sum = 0;
		for (int i = 0; i < data.length; i++) {
			data[i] = inputData(sc, i);
			sum += data[i];
		}
		System.out.println("배열 요소 총합: " + sum);

	}// end main()
/*
 * sc.nextInt()메소드는 정수를 입력하면 개행문자 앞까지만 읽어오지만
 * 에러가 발생하여 개행문자가 버퍼에 남아있어
 * 다시 정수입력할 때 개행문자가 자동으로 입력되기 때문에 무한반복이 된다.
 * \r : carriage return 개행문자 (13)
 * \n : new line 줄바꿈 (10)
 * 
 */
	public static int inputData(Scanner sc, int index) {
		int num;

		while (true) {
			try {
				System.out.printf("%d번째 정수를 입력:", index + 1);
				num = sc.nextInt();
				break;
			} catch (InputMismatchException ex) {
				System.out.println("정수를 입력하세요.");
				sc.next();
				//System.out.println("error: " + sc.next());
			}
		}
		return num;
	}// end inputData()

}// end class
