package java012_api;

import java.util.Random;

public class Java138_Random {

	public static void main(String[] args) {
		Random ran = new Random();
		double r1 = ran.nextDouble(); //0.0 ~ 0.9
		System.out.println(r1);
		
		int r2 = ran.nextInt();
		System.out.println(r2); //10진수의 난수
		
		int r3 = ran.nextInt(10); //0부터 10미만의 난수 발생
		System.out.println(r3); 
		
		//1부터 10까지의 난수
		System.out.println(r3+1);

	}//end main()

}//end class
