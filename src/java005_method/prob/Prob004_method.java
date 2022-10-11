package java005_method.prob;

/*
 * <프로그램 실행결과>
 * 주어진 배열에서 3의 배수의 개수=> 6
 * 주어진 배열에서 3의 배수의 합=> 108
 */

public class Prob004_method {

	public static void main(String[] args) {
		int[] data = { 1, 3, 5, 8, 9, 11, 15, 19, 18, 20, 30, 33, 31 };
		process(data);
	}//end main()

	public static void process(int[] data) {
		int cnt = 0; // 3의 배수 개수
		int sum = 0; // 3의 배수 합
		// 여기에 3의 배수의 개수와 합을 구하는 코드를 작성하세요.
		for(int i=0;i<data.length;i++) {
			if(data[i]%3==0) {
				cnt += 1;
				sum += data[i];
			}
		}
	
		
	
		////////////////////////////////////////////
		System.out.println("주어진 배열에서 3의 배수의 개수=>" + cnt);
		System.out.println("주어진 배열에서 3의 배수의 합=>" + sum);
	}//end process()
}//end class
