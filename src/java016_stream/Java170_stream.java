package java016_stream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Java170_stream {

	public static void main(String[] args) {
		File file = new File("src/java016_stream/song.txt");
	    
		RandomAccessFile raf = null;
		String stn = new String("\r\nMaroon 5 - Daylight, Sunday Morning \r\n");
		
		try {
			raf = new RandomAccessFile(file,"rw");
			try {
				System.out.println(raf.getFilePointer()); // 0
				
				//song.txt파일의 총 길이를 구한다.
				long size = raf.length();
				
				//파일의 끝으로 포인터를 이동한다.
				raf.seek(size);
				
				//파일 대상에 데이터를 보낸다.
				//.writeUTF로 사용하는데, 입력안한 문자가 나와서 writeBytes로 변경
				raf.writeBytes(stn);
				
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}finally {
			try {
				raf.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}// end main()

}// end class
