package ncs.test6;

import java.util.Scanner;

public class ExceptionTest {

	public static void main(String[] args) {
		Calculator cl = new Calculator();
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(cl.getSum(num));
		
		
	}

}
