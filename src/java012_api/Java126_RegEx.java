package java012_api;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Java126_RegEx {

	public static void main(String[] args) {
		String phone = "016-253-5243";
		System.out.println(phone.matches("01(1|6|9)-([0-9]{3}|[0-9]{4})-[0-9]{4}")); //true
		System.out.println(phone.matches("01(1|6|9)-(\\d{3}|\\d{4})-\\d{4}")); //true

		Matcher mt = Pattern.compile("01(1|6|9)-(\\d{3}|\\d{4})-\\d{4}").matcher(phone);
		while(mt.find())
			System.out.printf("%s\n",mt.group()); //016-253-5243
		
		
	}//end main()

}//end class
