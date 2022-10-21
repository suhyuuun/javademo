package java016_stream;

import java.io.File;

public class Java174_stream {

	public static void main(String[] args) {
		File file = new File("src/java016_stream/test.txt"); 
		if (file.exists()) {

			file.delete();// 파일이나 폴더나 지우는 것은 .delete()
			System.out.println("파일 삭제");

		}else {
			System.out.println("파일 없음");
		}
	}//end main()
}//end class




/*
 * java.awt.Frame;
 * java.awt.event.ActionListener;
 * 
 * import java.awt.*
 * import java.awt.event.*
 * -> 이렇게 두개다 잡아야 사용가능
 * -> 프로그램에서 다룰때는 같은 폴더가 아닌감...
 */
