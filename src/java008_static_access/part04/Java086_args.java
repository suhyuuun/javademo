package java008_static_access.part04;

//java -d . Java086_arags.java
//java java008_static_access.part04.Java086_args hello world 2022
public class Java086_args {

	public static void main(String[] args) {
//		System.out.println(args[0]);
//		System.out.println(args[1]);
//		System.out.println(args[2]);
		
		for(String data : args) {
			System.out.println(data);
		}
	}//end main()

}//end class
