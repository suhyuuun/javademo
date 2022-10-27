package ncs.answ.test06;

public class Calculator {
	public static double getSum(int data) {
		double sum = 0.0;
		if (data < 2 || data > 5)// { // data가 2부터 5까지의 범위를 벗어나면
			try {
				throw new InvalidException("입력값에 오류가 있습니다.");
				
			} catch (InvalidException e) {				
				System.out.println(e.getMessage());
				System.exit(0);				
			}
			
	
		  for (int i = 0; i <= data; i++)
			sum += i;
			return sum;
	
	}//end getSum

}//end Calculator