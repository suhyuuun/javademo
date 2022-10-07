package java003_statements.prob;

/*
for문을 이용해서 12의 약수를 구하시오
약수 : 어떤 수를 나누어서 0으로 떨어진 수
1
2 
3 
4 
6 
12
*/

public class Prob_01 {

	public static void main(String[] args) {
		for(int i=1;i<=12;i++) {
			if(12%i==0) {
				System.out.println(i);
			}
		}
		
		

	}//end main()

}//end class













