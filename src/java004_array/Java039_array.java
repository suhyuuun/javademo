package java004_array;

//num배열에 저장된 요소의 합계를 구하는 프로그램 구현
public class Java039_array {

	public static void main(String[] args) {
		int[] num = new int[] {22,3,8,12};
		int sum = 0;
		/*
		sum = sum + num[0]; // 22 = 0 + 22
		sum = sum + num[1]; // 25 = 22 + 3
		sum = sum + num[2]; // 33 = 25 + 8
		sum = sum + num[3]; // 45 = 33 + 12
		*/
		
		for(int i=0;i < num.length;i++) {
			sum = sum + num[i];
		}
		System.out.println("합계:"+sum);
	}//end main() 

}//end class
