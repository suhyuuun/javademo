package java007_class.part07;

public class Java080_varg {
	public static void main(String[]args) {
		CountVarg cv = new CountVarg();
		cv.addValue(4, 8);
		cv.addValue(2, 3, 9);
		cv.addValue(1, 5, 2, 4, 9);
		cv.addValue(1.3, 2.5);
		cv.sumValue("홍길동", 70,80,65);
	}
}
