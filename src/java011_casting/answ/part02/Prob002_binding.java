package java011_casting.answ.part02;
/*
 * [출력결과]
 * 이름          급여      정규보너스    특별보너스
 * =============================================
 * kim		 1200000	 150000	   	  156000
 * lee		 1750000	 100000		  262500
 * park		 2500000	 150000		  325000
 * hong		 2350000	 100000		  352500
 */

public class Prob002_binding {
	public static void main(String[] args) {
		Employee[] em = new Employee[] { new Engineer("kim", 1200000), new Developer("lee", 1750000),
				new Engineer("park", 2500000), new Developer("hong", 2350000) };

		/* Engineer는 급여의 13%, Devloper는 15%를 특별보너스로 지급하는 프로그램을 구현하세요. */

		System.out.println("이름          급여      정규보너스    특별보너스");
		System.out.println("=============================================");
		for (Employee ob : em) {
			if (ob instanceof Engineer)
				System.out.println(ob.toString() + "\t" + (int) (ob.salary * 0.13));
			else if (ob instanceof Developer)
				System.out.println(ob.toString() + "\t" + (int) (ob.salary * 0.15));
		}

	}
}
/*
 * kim 1200000 --eng lee 1750000 --dev park 2500000 --eng hong 2350000 --dev
 */
