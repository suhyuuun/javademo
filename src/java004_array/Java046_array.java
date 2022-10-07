package java004_array;
/*
 * 1 2 3 4 5
 * 6 7 8 9 10
 * 11 12 13 14 15
 * 16 17 18 19 20
 * 
 * num배열에서 아래와 같이 출력이 되도록 구현
 * [출력결과]
 * 1  2  *  4   5
 * *  7  8  *  10
 * 11  * 13 14  *
 * 16 17  * 19 20
 * */
public class Java046_array {

	public static void main(String[] args) {
		int[][] num = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 }, { 16, 17, 18, 19, 20 }};
		char star ='*';
		for(int row=0;row<num.length;row++) {
			for(int col=0;col<num[row].length;col++) {
				if(num[row][col]%3==0) {
					System.out.printf("%4c",star);
				}else {
				System.out.printf("%4d", num[row][col]);}
			}
			System.out.println();
			}
		}//end main()
	}//end class


