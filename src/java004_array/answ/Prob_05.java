package java004_array.answ;

public class Prob_05 {

	public static void main(String[] args) {
		String[] name = { "소원", "예린", "은하", "유주", "신비" };
		int answer[][] = { { 1, 3, 2, 4, 3, 1, 4, 2, 2, 1 }, 
						   { 3, 2, 4, 2, 2, 1, 1, 3, 4, 1 },
				           { 2, 4, 3, 2, 1, 2, 1, 3, 3, 4 }, 
				           { 2, 3, 3, 1, 1, 3, 2, 2, 4, 4 }, 
				           { 3, 1, 1, 2, 4, 1, 2, 3, 1, 3 } };
		int solution[] = { 1, 2, 3, 4, 4, 3, 2, 1, 1, 2 };

		for (int i = 0; i < 5; i++) {
			int score = 0;
			for (int j = 0; j < answer[i].length; j++) {
				if (answer[i][j] == solution[j])
					score++;
			}
			System.out.printf("%s 점수 : %d점\n",name[i], score);
		}
	}// end main()

}// end class
