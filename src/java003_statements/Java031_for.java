package java003_statements;
/*
 * 1   2   3   4 
 * 5   6   7   8
 * 9  10  11  12
 */
public class Java031_for {

	public static void main(String[] args) {
		int data =1;
		
		for(int row = 1;row<=3;row++) {
			for(int col = 1;col<=4;col++) {
				System.out.printf("%4d", data++); //%nd -> n자리를 출력하겠다.
				//data++;
			}//end for col
			System.out.println();
		}//end for row
	}//end main()

}//end class
