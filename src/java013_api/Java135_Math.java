package java013_api;

import static java.lang.Math.*;

public class Java135_Math {

	public static void main(String[] args) {
		//임의값 0.0 <= x <1.0
		double ran = random();
		System.out.println(ran);
		
		//0.00 <= x < 9.99
		ran = ran *10;
		System.out.println(ran);
		
		//소수점 이하는 버림(0.0 ~ 9.0을 리턴)
		//int로 형변환을 통해 0~9로 변환
		int num = (int)floor(ran); //floor(ran): 버림round(ran): 반올림, ceil(ran): 올림
		System.out.println(num);
		
		//1부터 10까지
		num = num + 1;
		System.out.println(num);
		
		System.out.println("=============================");
		
		System.out.println((int)(floor(random()*10))+1);
	}//end main()

}//end class
