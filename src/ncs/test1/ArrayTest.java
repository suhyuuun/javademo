package ncs.test1;
/*
 * 합계와 평균 값은 double로 처리한다.
 * [출력결과]
 * 합계 : 767.00
 * 평균 : 38.35
 */
public class ArrayTest {

	public static void main(String[] args) {
		int[][] array = {{12,41,36,56,21},{82,10,12,61,45},{14,16,18,78,65},{45,26,72,23,34}};
		int sum = 0;
		int cnt = 0;
		
		for(int i = 0; i<array.length;i++) {
			for(int j = 0; j<array[i].length; j++) {
				sum += array[i][j];
				cnt++;
			}
		}
		
		System.out.printf("합계 : %.2f\n",(double)sum);
		System.out.printf("평균 : %.2f\n",(double)sum/cnt);
	}

}
