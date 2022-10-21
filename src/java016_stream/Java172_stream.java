package java016_stream;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Java172_stream {

	public static void main(String[] args) throws IOException { //throws 사용하는 것은 좋은방법아님 권장안함
		// File file = new File("src/java016_stream/temp");
		// File file = new File("src/java016_stream/a/b");
		// System.out.println(file.isDirectory()); //false
		File file = new File("src/java016_stream/sample.txt");

		//시스템이 종료되면 파일삭제
		file.deleteOnExit();
		
		Scanner sc= new Scanner(file);
		System.out.println(sc.nextLine());
		System.out.println(sc.nextLine());
		//.close()을 해서 닫아줘야 프로그램 종료 아니면 파일이 삭제되지 않음
		sc.close();
		
		// 현재 파일이 directory이니?(존재하니?)
//		if (file.isDirectory()) {
//			 file.delete(); //폴더 삭제
//			file.deleteOnExit(); // 종료가 될때 삭제
//			System.out.println("폴더 삭제");
//		} else {
//			System.out.println("폴더 없음");
//		}
	}// end main

}// end class
