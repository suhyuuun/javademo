package java016_stream;

import java.io.File;

public class Java175_stream {

	public static void main(String[] args) {
		File file = new File("src/java016_stream/a");
		deleteFileList(file);

	}// end main()

//	public static void deleteFileList(File srcFile) {
//		File[] fileAll = srcFile.listFiles();
//		
//		if(fileAll != null) {
//			System.out.println(fileAll.length);
//			for(File file : fileAll) {
//				System.out.println(file);
//				deleteFileList(file);
//			}
//		}
//	}//end deleteFileList()

	public static void deleteFileList(File srcFile) {
		File[] fileAll = srcFile.listFiles();
		System.out.println(fileAll.length);
		if (fileAll.length != 0) {
			for (File file : fileAll) {
				System.out.println(file);
				deleteFileList(file);
			}
		}
		System.out.println("Remove File: " + srcFile.getPath());
		srcFile.delete();
		//Remove File: src\java016_stream\a\b\c
		//Remove File: src\java016_stream\a\b
		//Remove File: src\java016_stream\a
	}

}// end class
