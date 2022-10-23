package java016_stream.answ;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;



/*
 * [문제]score.txt 파일의 점수 정보를 읽어 들여서 각 학생의 점수 총합을 
 *       콘솔창에 출력하는 입출력 프로그램을 main() 메서드에 구현하시오.
 * 
 * [프로그램 실행결과]
 * kim의 점수 통합 :146
 * hong의 점수 통합 :243
 * park의 점수 통합 :240
 */
public class Prob001_stream {
	
	public static void main(String[] args) {
	     //각 학생의 총점을 출력하는 프로그램을 구현하시오.
		
		File file=new File("./src/java016_stream/answ/score.txt");
		try {
			Scanner sc=new Scanner(file);
			
			while(sc.hasNext()){
				String line=sc.nextLine();
							
				// : 또는 /로 문자열을 구분한다.
				String data[]=line.split("[:/]");
				int sum=0;
				for(int i=1;i<data.length;i++)
					sum+=Integer.parseInt(data[i]);
				System.out.printf("%s의 점수 통합 :%d\n",data[0],sum);
			}
			
			
		} catch (FileNotFoundException e) {			
			e.printStackTrace();
		}
		
		
	}//end main()

}//end class











