package java016_stream;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Java166_stream {

	public static void main(String[] args) {
		File file = new File("sample.txt");
		System.out.println(file.exists()); //false
		System.out.println(file.isFile()); //false
		System.out.println(file.length()); //0
		
		FileWriter fw = null;
		
		try {
			//mode의 값이 true이면 append
			//mode의 값이 false이면 update
			//mode의 값을 생략하면 false
			fw = new FileWriter(file, false);
			fw.write("java\n"); //buffer에 저장
			fw.flush();
			fw.write("jsp\n"); //buffer에 저장
			fw.flush();
			fw.write(new char[] {'s','p','r','i','n','g'});
			fw.write("\n");
			fw.flush();
			fw.write(97); //unicode인 a가 들어감
			fw.write("\n");
			fw.flush();
			fw.write(new char[] {'s','p','r','i','n','g'},0,3);
			fw.write("\n");
			fw.close();
			fw.write("mybatis");
			fw.flush(); // Stream closed
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		

	}

}
