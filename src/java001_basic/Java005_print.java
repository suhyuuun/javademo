package java001_basic;

public class Java005_print {

	public static void main(String[] args) {
		byte bNum = 2;
		short sNum = 4;
		int xNum = 5;
		long lNum = 6L;
		float fNum = 2.5F;
		double dNum = 7.4;
		char cData = 'a';// char 문자 : 홀따옴표
		boolean eNum = true;
		String sData = "java"; // String 문자열 : 쌍따옴표

		System.out.println(bNum + "," + sNum);// 2,4 / 숫자 + 숫자 = 숫자, 숫자 + 문자 = 문자연결
		// System.out.printf("출력방식", 값1, 값2, 값...) 
		//출력기호 
		//%d : 정수 (byte, short, int, long)
		//%f : 실수 (float, double)
		//%b : 논리 (boolean) 
		//%c : 문자 (char)
		//%s : 문자열 (String) 
		//%% : % 
		//\n : 줄바꿈 
		//\t : 탭
		System.out.printf("%d %d %d %d %f %f %b %c %s \n", bNum, sNum, xNum, lNum, fNum, dNum, eNum, cData, sData);
		System.out.printf("%d %% %d = %d\n", 5,2,(5%2));//5 % 2 = 1
		System.out.print("java"); //줄바꿈이 일어나지 않음
		System.out.print("program");
		System.out.println();//줄바꿈이 일어남
		System.out.println("jsp");
		System.out.println("test");

	}

}
