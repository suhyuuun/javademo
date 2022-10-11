package java005_method;
//참조데이터타입은 자동 형변환이 일어나지 않기때문에 데이터 타입 맞춰서 작성해줘야함
public class Java055_method {

	public static void main(String[] args) {
		int a=4, b=2, c=5;
		int[]num = new int[] {2,3};
		int[]data = new int[] {2,6,2,8};
		
		System.out.println(process(a,b,c)); //리턴해주는 값이 있어서 system.out.println()안에서 출력가능
	  //System.out.println(process2(a,b,c));//리턴해주는 값이 없어서 출력불가

	  System.out.println(plus(num));
	  System.out.println(plus(data));

	}//end main()

	public static int process(int x, int y, int z) {
		return x+y+z;
	}//end process()
	
	public static void process2(int x, int y, int z) {
		System.out.println(x+y+z); //리턴해주는 값이 없음
	}//end process()
	
	public static int plus(int[] arr) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum += arr[i];
		}
		return sum;
	}
}//end class
