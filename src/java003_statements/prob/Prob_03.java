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
		int plus=0; 
		int sum=0;
		

			for(;i<=5;i++) {				
				plus += i;
				sum += plus;
				}
				System.out.println("sum="+sum);

	}// end main()

}// end class
