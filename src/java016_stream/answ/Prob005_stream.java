package java016_stream.answ;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.Iterator;
import java.util.stream.Stream;

/*
 * [문제]
 *  sun.txt파일에서 데이터를 읽어온후 ‘\t’와 ‘ ‘을 ‘-‘ 로 변환하여
 *  프로그램을 구현하시오.
 *   
 * [프로그램 실행결과]
 * hello-world-!!!
 * java-programming
 * jsp-servlet-programming!
 */
public class Prob005_stream {
	public static void main(String args[]) {
		String[] lines = readLines(".\\src\\java016_stream\\answ\\sun.txt");

		for (int i = 0; i < lines.length; i++) {
			printLine(lines[i]);
		}
	}

	public static String[] readLines(String fileName) {
		/*
		 * 파라미터로 전달받은 txt파일을 읽어 들여, 파일의 줄 수에 해당하는 String[]을 생성하여 해당 String[]에 한
		 * 라인씩 저장해서 반환한다.
		 */

		FileReader fr = null;
		BufferedReader br = null;
		String[] sn = null;
		File file = new File(fileName);
		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);

			Stream<String> aa = br.lines();
			Object[] line = aa.toArray();
			sn = new String[line.length];
			for (int i = 0; i < sn.length; i++)
				sn[i] = (String) line[i];
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return sn;
	}// end readLines()

	public static void printLine(String line) {
		/*
		 * 문자열을 받아들여 ‘\t’와 ‘ ‘을 ‘-‘ 로 변환하여 콘솔에 출력한다.
		 */

		System.out.println(line.replaceAll("[\t ]", "-"));
	}// end printLine()
}// end class



