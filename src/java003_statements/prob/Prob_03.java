package java003_statements.prob;

/*
1+
1+2+
1+2+3+
1+2+3+4+
1+2+3+4+5=??

출력결과
sum=35
*/
public class Prob_03 {

	public static void main(String[] args) {
		int i=1;
		int sum = 0;
		while(i<=5) {
			sum = sum +i;
			i++;
			
		}
		System.out.println(sum);
	}// end main()

}// end class
