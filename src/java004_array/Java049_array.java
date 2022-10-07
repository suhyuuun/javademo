package java004_array;
/*
a b c d
a b c d
a b c d
a b c d
[출력결과]
* a b c d
a * b c d
a b * c d
a b c * d
a b c d *
*/

public class Java049_array {

	public static void main(String[] args) {
		char[][] alpa = new char[][] { { 'a', 'b', 'c', 'd' }, { 'a', 'b', 'c', 'd' }, { 'a', 'b', 'c', 'd' },
				{ 'a', 'b', 'c', 'd' } };

		for (int i = 0; i < alpa.length; i++) {
			for (int j = 0; j < alpa[i].length; j++) {
				if (i == j) {
					System.out.printf("%4c", '*');
				}
				System.out.printf("%4c", alpa[i][j]);
			}
			System.out.println();
			
			//마지막 문장을 위한 소스
			if (i == alpa.length - 1) {
				for (int k = 0; k < alpa[i].length; k++) {
					System.out.printf("%4c", alpa[i][k]);
				}
				System.out.printf("%4c", '*');
			}
		}
	}// end main()

}// end class
