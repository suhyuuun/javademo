package java005_method.prob;
/*
매개변수로 받은 두 정수형 배열의 내용을 결합하여 하나의 배열로 리터하는 
mergeArray() 메서드를 구현하시오.
[출력결과]
<< 두 배열을 합친 배열 내용 >>
1
2
3
4
5
10
20
30
*/

public class Prob001_method {

	public static void main(String[] args) {
		int[] array1 = { 1, 2, 3, 4, 5 };
		int[] array2 = { 10, 20, 30 };
		int[] result = mergeArray(array1, array2);
		System.out.println("<< 두 배열을 합친 배열 내용 >>");
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}// end main()

	public static int[] mergeArray(int[] array1, int[] array2) {
		// 여기에서 구현하세요.
		 	int[]arr = new int[array1.length + array2.length];
		 	for(int i=0;i<array1.length;i++) {
		 		arr[i] = array1[i];
		 		}
		 	for(int i=0;i<array2.length;i++) {
		 		arr[i+array1.length] = array2[i];
		 	}
		return arr;
	}// end mergeArry()

}// end class
