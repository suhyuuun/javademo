package java001_basic;

public class Java013_operators {

	public static void main(String[] args) {
		int a = 3;
		int b = 5;
		int c = 7;
		
		// && 연산자의 좌변이 false이면 우변은 수행하지 않는다.
		boolean res = (++a > b) && (++b > c);
		System.out.printf("a=%d, b=%d, c=%d, res=%b\n", a, b, c, res); 
																	

		int x = 4;
		int y = 8;
		int z = 10;

		// || 연산자의 좌변이 true이면 우변은 수행하지 않는다.
		res = (z > ++y) || (++x > y);
		System.out.printf("x=%d, y=%d, z=%d, res=%b\n", x, y, z, res);
																		

		int k = 1;
		int m = 2;
		int n = 3;

		// 우선순위: && > ||
		res = k == 2 && ++m == 2 || n == 3;
		System.out.printf("k=%d, m=%d, n=%d, res=%b\n", k, m, n, res);

		k = 1;
		m = 2;
		n = 3;

		res = --k == 2 || m-- == 2 && n == 3;//변수 뒤에 --가 있으면 비교 뒤에 -- 처리
		System.out.printf("k=%d, m=%d, n=%d, res=%b\n", k, m, n, res);
	}

}
