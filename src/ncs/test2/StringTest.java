package ncs.test2;

public class StringTest {

	public static void main(String[] args) {
		String str = "1.22,4.12,5.93,8.71,9.34";
		double data[] = new double[5];
		double sum = 0;

		// str에서 데이터를 분리한다.
		String[] line = str.split(",");

		// 김수현풀이
//		for(int i = 0;i<line.length;i++) {
//			sum += Double.parseDouble(line[i]);
//		}

		int cnt = 0;

		for (String sub : line)
			data[cnt] = Double.parseDouble(sub);
			sum += data[cnt];
			cnt++;

		// 결과 값을 출력한다.
		System.out.printf("합계:%.3f\n", sum);
		System.out.printf("평균:%.3f\n", sum / cnt);
	}// end main()

}// end class
