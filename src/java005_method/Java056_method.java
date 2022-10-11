package java005_method;

public class Java056_method {

	public static void main(String[] args) {
		int a = 10, b=20;
		int c = a, d = b; //값에 의한 복사 (call by value)
		
		//c, d 변수의 값을 교환
		int temp = c; 
		c = d;
		d = temp;
		
		System.out.printf("a=%d, b=%d\n",a,b);
		System.out.printf("c=%d, d=%d\n",c,d);
		
		System.out.println("===========================");
		int[]num = new int[] {10,20};
		int[]arr = num; //주소에 의한 복사 (call by reference)
		
		//arr[0], arr[1]을 값을 교환
		int imsi = arr[0];
		arr[0] = arr[1];
		arr[1] = imsi;
		
		System.out.printf("num[0] = %d, num[1] = %d\n", num[0], num[1]);
		System.out.printf("arr[0] = %d, arr[1] = %d\n", arr[0], arr[1]); //주소값을 복사해서 arr과 num모두 바뀜

		

	}//end main()

}//end class
