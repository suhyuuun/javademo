package java013_api;
/*
 * 난수를 이용해서 소숫점 첫째자리까지 반올림해서 구하시오.
 * ex. 0.5689... -> 5.7
 */
import static java.lang.Math.*;
public class Java136_Math {

	public static void main(String[] args) {
		double nan = random();
		System.out.println(nan);
		
		nan = nan*100;
		System.out.println(nan);
		
		//System.out.println(round(nan));
		
		long data = round(nan);
		System.out.println(data);
		
		double num = (double)data/10;
		//double num = data/10.0;
		System.out.println(num);
		
		System.out.println("=============================");
		double res = random();
		System.out.println(res);
		System.out.println((double)(round(res*100))/10);
	}//end main()

}//end class
