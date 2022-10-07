package java004_array;
/*
 * [출력결과]
 * 1  2  3  4  5
 * -  -  -  -  -
 * 11 12 13 14 15
 * -  -  -  -  -
 * 
 * */
public class Java047_array {

	public static void main(String[] args) {
		int[][]num= {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20}};
		for(int row=0;row<num.length;row++) {
			for(int col=0;col<num[row].length;col++) {
				if(row%2==1) {
					System.out.printf("%4s",'-');
				}else {
					System.out.printf("%4d",num[row][col]);
				}//end if-else
			}//end of col
			System.out.println();
		}//end of row
	}//end main()

}//end class
