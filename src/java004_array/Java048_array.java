package java004_array;
/*
 * [출력결과]
 * 1  2  3  4  5
 * 10 9  8  7  6
 * 11 12 13 14 15
 * 20 19 18 17 16
 * */
public class Java048_array {

	public static void main(String[] args) {
		int[][] num = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 }, { 16, 17, 18, 19, 20 } };
		int col = 0;
		for (int row = 0; row < 4; row++) {
			if (col % 2 == 0) {
				for (; col < 5; col++) {
					System.out.printf("%4d", num[row][col]);
				}
			} else{
				for (col = 4; col >= 0; col--) {
					System.out.printf("%4d", num[row][col]);
				}
				col++;
			}
			System.out.println();
		}
		
	}//end main()

}//end class
