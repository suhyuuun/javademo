package java016_stream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class Java168_stream {

	public static void main(String[] args) {
		FileReader fr = null;
		
		//라인번호를 출력할 수 있는 메소드를 제공하는 스트림이다.
		LineNumberReader nr = null;
		
		try {
			fr = new FileReader("src/java016_stream/score.txt");
			nr = new LineNumberReader(fr);
			String line = null;
			
			//readLine() : 파일의 끝이면 null을 리턴한다.
			while((line = nr.readLine()) != null) {
				System.out.printf("%d : %s\n",nr.getLineNumber(), line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				nr.close();
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}//end main()

}//end class
