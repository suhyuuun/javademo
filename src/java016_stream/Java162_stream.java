package java016_stream;

import java.io.IOException;
import java.io.InputStream;

public class Java162_stream {

	public static void main(String[] args) {
		System.out.print("데이터 입력:");
		InputStream is = System.in;
		int data;
		
		try {
			while((data = is.read())!= 13) {
				System.out.println((char)data);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}//end main()

}//end class
