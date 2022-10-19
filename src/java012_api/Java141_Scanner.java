package java012_api;

import java.util.Scanner;

public class Java141_Scanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		System.out.print("부서 연봉 평가:"); //기획부 3000 4.5
//		String line = sc.nextLine();
//		System.out.println(line);

		System.out.print("부서:");
		String dept = sc.next();
		
		System.out.print("연봉:");
		int salary = sc.nextInt();
		
		System.out.print("평가:");
		Double avg = sc.nextDouble();
		
		System.out.printf("%s %d %.1f\n", dept, salary, avg);

	}//end main()

}//end class

