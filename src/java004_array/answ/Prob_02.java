package java004_array.answ;
/*
 * 4행 4열 data배열에 가로 세로 합계를 구하는 프로그램을 구현하시오.
 * [출력결과]
 *  1   2   3   6
 *  4   5   6  15
 *  7   8   9  24
 * 12  15  18  45
 */

public class Prob_02 {

	public static void main(String[] args) {
		int[][] data = new int[4][4];
		int cnt = 1;
		// 여기를 구현하시오.
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				data[i][j] = cnt++;
			}
		}
		//////////////////
		//연산
		for(int i=0; i<data.length-1;i++){
			for(int j=0; j<data[i].length-1; j++){
				data[i][3]+=data[i][j];
				data[3][j]+=data[i][j];				
			}
			data[3][3]+=data[i][3];
		}
		
		///////////////////////////////
		//출력
		for(int i=0; i<data.length;i++){
			for(int j=0; j<data[i].length;j++){
				System.out.printf("%4d",data[i][j]);
			}
			System.out.println();
		}
		

	}// end main()

}// end class
