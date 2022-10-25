package ncs.test6;

public class Calculator {
	double sum = 0.0;
	public double getSum(int data) {
		if(data>=2 && data<=5) {
			for(int i = data;i<0;i--) {
				sum += i;
			}
		}else {
			System.out.println("입력 값에 오류가 있습니다.");
			
		}
		return sum;
		
		
	}
	
	
}
