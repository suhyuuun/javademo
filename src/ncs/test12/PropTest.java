package ncs.test12;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.Properties;
import java.util.Scanner;


public class PropTest {

	public static void main(String[] args) {
		//명시한 사용 데이터를 prop에 기록한다.
		File file = new File("data.xml");
		
		//fileSave() 메소드를 호출한다.
		
		//fileOpen() 메소드를 호출한다.

	}//end main()
	
	public void fileSave(Properties p) {
		File file = new File("data.xml");
		FileWriter fw = null;
		try {
			fw = new FileWriter(file, false);
			fw.write("apple",1200,3);
			fw.flush();
			fw.write("banana",2500,2);
			fw.flush();
			fw.write("orange",800,10);
			fw.flush();
			fw.write("melon",5000,2);
			fw.flush();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}//end fileSave
	
	public void fileOpen(Properties p) {
		File file = new File("data.xml");
		Scanner sc = null;
		try {
			sc = new Scanner(file);
			String [] data = sc.next().split(",");
			System.out.println(data[0]);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}//end fileOpen
}//end class
