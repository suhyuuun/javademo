package java012_api;

import java.util.Scanner;

public class Java142_Scanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("부서 연봉 평가"); //기획부 3000 4.5
		String line = sc.nextLine();
		System.out.println(line);
		
		String[] arr = line.split("\\s{1,}");
		System.out.println(arr.length);
		for(int i = 0; i<arr.length; i++) 
			System.out.printf("arr[%d]=%s\n",i,arr[i]);
		
		//System.out.printf("%s %s %s\n",arr[0], arr[1], arr[2]);
	}//end main()

}//end class
