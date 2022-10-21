package java016_stream;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;



public class Java172__1_stream {

	public static void main(String[] args) {
		File file = new File("src/java016_stream");
		FileWriter fw=null;
		Scanner sc =null;
		 try {		
			 
			File tempFile = File.createTempFile("source", "txt", file);			
			tempFile.deleteOnExit();
			fw = new FileWriter(tempFile);
			fw.append("java\n");
			fw.append("jsp\n");
			fw.flush();
			
			 sc = new Scanner(tempFile);
			System.out.println(sc.nextLine());
			System.out.println(sc.nextLine());
			sc.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
			
				fw.close();
			
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
			
		}
		 
		 

	}

}
