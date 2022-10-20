package java014_api.prob;

import java.util.Scanner;

/*
 * [실행결과]
 * 97에서 122까지정수 입력:122
 * z
 */
public class Prob006_String {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("97에서 122까지정수 입력:");
		int x=sc.nextInt();
		
		System.out.printf("%s\n", result(toChar(x)));
	}
	
	public static char toChar(int x){
		
		return ' '; 
	}
	
	public  static String result(char data){
	
		return null;
	}	
}









