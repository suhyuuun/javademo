package ncs.test6;

import java.util.Scanner;

public class ExceptionTest {

	public static void main(String[] args) {
		Calculator cl = new Calculator();
		InvalidException in = new InvalidException();
		
		Scanner sc = new Scanner(System.in);
		double num = sc.nextDouble();
		if(num>=2 && num<=5) {
			cl.getSum((int)num);
		}else {
			in.InvalidException(null);
		}
		
		
		
	}

}
