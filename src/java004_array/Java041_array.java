package java004_array;
 //%n.mf -> n: 자릿수 m: 소수점 m번째까지 표현 
public class Java041_array {

	public static void main(String[] args) {
		int[] data1 = new int[3]; //0 기본값
		long[] data2 = new long[3]; //0L
		float[] data3 = new float[3]; //0.0f
		double[] data4 = new double[3]; //0.0
		char[] data5 = new char[3];//\u0000
		boolean[] data6 = new boolean[3]; //false
		String[] data7 = new String[3];//null
		
		
		for(int i=0;i<data7.length;i++) {
			System.out.printf("data[%d]=%s\n",i, data7[i]);
		}
		
		System.out.println("============================");
		//https://www.techonthenet.com/unicode/chart.php
		char a = ' ';
		char b = '\u0020'; //공백, space (유니코드값)
		char c = '\u0000'; //null (유니코드값)
		char d = 0; //숫자
		
		System.out.println(a==b);//true
		System.out.println(c==d);//true

		
		
	}//end main()
}//end class
