package java005_method.prob;
/*
 * [출력결과]
 * 내림 차순 결과
    31
	22
	16
	11
	10
	9
    오름 차순 결과
	9
	10
	11
	16
	22
	31
 */

public class Prob007_method {

	public static void main(String[] args) {
		int[] arr = {10, 22, 9, 16, 11, 31};

		int[] result1 = sort(arr, "desc");
		int[] result2 = sort(arr, "asc");
		System.out.println("내림 차순 결과");
		for (int i = 0; i < result1.length; i++) {
			System.out.println(result1[i]);
		}
		System.out.println("오름 차순 결과");
		for (int i = 0; i < result2.length; i++) {
			System.out.println(result2[i]);
		}
	}//end main( )

	private static int[] sort(int[] array, String orderby) {
		// 구현하시오.
		int[] sorted_Arr = array.clone();
		int temp;
		
		
		if(orderby=="desc") {
			for(int i = 0 ; i<array.length; i++) { //반복횟수
			  for(int j =1; j<sorted_Arr.length; j++) { //bubble 정렬
				  if(sorted_Arr[j-1] < sorted_Arr[j] ) {
					  temp = sorted_Arr[j-1];
					  sorted_Arr[j-1] = sorted_Arr[j];
					  sorted_Arr[j] = temp;
				  }
			  }
			}
		}else {
			for(int i = 0 ; i<array.length; i++) { //반복횟수
				  for(int j =1; j<sorted_Arr.length; j++) { //정렬
					  if(sorted_Arr[j-1] > sorted_Arr[j] ) {
						  temp = sorted_Arr[j-1];
						  sorted_Arr[j-1] = sorted_Arr[j];
						  sorted_Arr[j] = temp;
					  }
				  }
				}
		}
		return sorted_Arr;
	}//end sort( )
}