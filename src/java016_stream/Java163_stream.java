package java016_stream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Java163_stream {

	public static void main(String[] args) {
		//바이트 스트림
		InputStream is = System.in;
		
		//바이트 스트림과 문자 스트림 연결
		InputStreamReader ir = new InputStreamReader(is);
		
		//문자 스트림
		BufferedReader br = new BufferedReader(ir);
		System.out.print("데이터입력:");
		try {
//			int data = br.read();
//			System.out.println(data);
//			System.out.println((char)data);
/////////////////////////////////////////////////////////////////
//			int data;
			
//			while((data=br.read())!=13) {
//				System.out.println((char)data);
//			}
			
//////////////////////////////////////////////////////////////////
			String line = br.readLine();
			System.out.println(line); //string으로 리턴 byte아님
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				br.close();
				ir.close();
				is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
	
	}//end main()

}//end class
