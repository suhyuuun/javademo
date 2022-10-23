package java016_stream.answ;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*[문제]
 * data.txt 파일에는 PRODUCT 테이블의 컬럼 이름들이 저장되어있다. 
 * 이 컬럼 이름들을 Java 의 변수명으로 변환하여 콘솔창에 출력하는
 *  makeVariable() 메소드를 구현하시오. 
 * Java 의 변수명은 camel case 가 적용된 형태로 변환해야 한다
 * 
 * [실행결과]
 * prodNo
 * prodName
 * price
 * amount
 * maker
 * regDate
 */

public class Prob002_stream {
	public static void main(String[] args) {
		String fileName = ".\\src\\java016_stream\\answ\\data.txt";
		makeVariable(fileName);
	}// end main()

	private static void makeVariable(String fileName) {
		// 구현하세요.
		try {
			Scanner sc = new Scanner(new File(fileName));

			while (sc.hasNextLine()) {
				//PROD_NO
				String line = sc.nextLine();
				for (int i = 0; i < line.length(); i++) {
					if (line.charAt(i) == '_')
						continue;
					else if (i != 0 && line.charAt(i - 1) == '_')
						System.out.printf("%c", line.charAt(i));
					else
						System.out.printf("%c", Character.toLowerCase(line.charAt(i)));
				}

				System.out.println();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}// end makeVariable()
}// end class
