package java001_basic;

public class Java012_operators {

	public static void main(String[] args) {
		/*
		 *  true && true => true
		 *  false || false => false
		 *  !true => false
		 */
		
		int x = 3;
		int y = 6;
		int z = 3;
		boolean res;
		res = x<y && x==z;
		System.out.println(res);//true
		
		res = x>y || x==z;
		System.out.println(res);//true
		
		
	}

}
