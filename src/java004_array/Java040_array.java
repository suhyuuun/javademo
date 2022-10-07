package java004_array;

public class Java040_array {
	public static void main(String[] args) {
		int[]num = new int[] {22,3,8,12};
		int odd=0;
		int even=0;
		
		for(int i=0;i<num.length;i++) {
			//i의 값이 홀수이면
			if(num[i]%2==1) {
				odd = odd +num[i];
			}else {
				even = even + num[i];
			}
		}
		System.out.println("짝수의 합:" + even);
		System.out.println("홀수의 합:" + odd);

	}//end main()
}//end class
