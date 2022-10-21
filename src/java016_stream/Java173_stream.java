package java016_stream;

import java.io.File;
import java.io.IOException;

public class Java173_stream {

	public static void main(String[] args) {
		File file = new File("src/java016_stream/test.txt"); 
		if(!file.exists()) {
			try {
				file.createNewFile();// 파일 생성
				System.out.println("파일 생성");
			} catch (IOException e) {
				e.printStackTrace();
			} 
		}
	}//end main()

}//end class
