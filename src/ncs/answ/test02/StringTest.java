package ncs.answ.test02;

public class StringTest {

	public static void main(String[] args) {
		String str = "1.22,4.12,5.93,8.71,9.34";
		
		double data[]= new double[5];      
		
		double sum = 0; 
		int cnt = 0;
	    // str에서 데이터를 분리한다.      
		String[] st;   
		st = str.split(",");
		
		for (String sub : st) {
			data[cnt] = Double.parseDouble(sub);
			sum += data[cnt];
			cnt++;
		}
	   System.out.printf("합계 : %.3f\n", sum);
	   System.out.printf("평균 : %.3f", sum/cnt);
	}
}
