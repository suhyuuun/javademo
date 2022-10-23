package java016_stream.answ;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * [문제]
 *  jumsu.txt 파일로부터 학생의 점수를 읽어들여 총점과 평균을 jumsu.txt 파일 끝에 덧붙여 출력하는 프로그램을 작성하시오.
    단, 평균점수는 소수점 첫 번째 자리까지만 남기고 나머지는 잘라낸다.(truncate) 
    
    [프로그램 실행결과]
    태연:65
	수영:97
	제시카:100
	티파니:86
	써니:88
	총점:436
	평균:87.2
 */
public class Prob004_stream {
	public static void main(String[] args) {
		// 프로그램을 구현하시오.
		int sum = 0;
		double avg = 0.0;
		int cnt = 0;
		FileReader fr = null;
		BufferedReader br = null;
		FileWriter fw=null;
		
		try {
			fr = new FileReader(".\\src\\java016_stream\\answ\\jumsu.txt");
			br = new BufferedReader(fr);
			String line;
			while ((line = br.readLine()) != null) {
				String[] str = line.split(":");
				if (str.length > 1) {
					sum += Integer.parseInt(str[1]);
					cnt++;
				}
			}

			avg = sum / (double) cnt;

			avg = Math.floor(avg * 10) / 10;

			System.out.println("program end");
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

		try {
			fw = new FileWriter(".\\src\\java016_stream\\answ\\jumsu.txt", true);
			fw.write("\r\n총점:" + sum + "\r\n");
			fw.write("평균:" + avg + "\r\n");
			

		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				fw.close();
			} catch (IOException e) {				
				e.printStackTrace();
			}
		}

	}// end main()
}// end class
