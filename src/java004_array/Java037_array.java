package java004_array;
/*
 * 변수 : 하나의 값을 저장하기 위한 메모리 공간
 * 배열 : 서로 관련이 있는 데이터 타입이 같은 데이터의 집합
 * */
public class Java037_array {

	public static void main(String[] args) {
		int ko = 90;
		int en = 80;
		int jp = 40;
		
		int[] arr; //배열 선언  자바에서는 int arr[]; 이런식으로 선언가능
		//배열 생성 - 메모리 생성(확보)
		//new 키워드를 이용해서 배열을 생성
		//각 요소(element)마다 인덱스가 0부터 생성된다.
		arr = new int[3]; //배열 생성
		
		//int[]arr = new int[3];
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
		arr[0] = 90;
		arr[1] = 80;
		arr[2] = 40;
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
		//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
		//System.out.println(arr[3]);
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}//.length : 자바스크립트에서는 프로퍼티, 자바에서는 키워드

	}//end main()

}//end class
