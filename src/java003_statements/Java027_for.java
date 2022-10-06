package java003_statements;
/*
 i=1
 i=2
 i=3
 i=4
 i=5
 sum=15
 */
public class Java027_for {

	public static void main(String[] args) {
		int sum = 0;
		int i;

		for (i = 1;; i++) {
			sum = sum + i;
			System.out.printf("i=%d\n", i);
			if (sum >= 15) {
				break;
			}
		}
		System.out.printf("sum=%d", sum);
	}
}
