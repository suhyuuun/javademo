package ncs.test10;

public class Company {

	public static void main(String[] args) {
		// 1번의 사용 데이터를 기반으로 객체를 생성하여 배열에 넣는다.
		Employee em[] = new Employee[2];
		
		Secretary se = new Secretary("Hilery",1,"seceretary",800);
		Sales sa = new Sales("Clinten",2,"sales",1200);
		em[0] = se;
		em[1] = sa;

		// 모든 객체의 기본 정보를 출력 한다(for)
		System.out.println("name \t department \t salary");
		System.out.println("-----------------------------------------------------");
		for(int i = 0; i<em.length; i++) {
			System.out.printf("%s \t %s \t %d\n",em[i].getName(), em[i].getDepartment(), em[i].getSalary());
		}

		// 모든 객체에 인센티브 100씩 지급한 급여를 계산하고 다시 객체의 salary에 넣는다.
		// 모든 객체의 정보와 세금을 출력한다(for)
		System.out.println("인센티브 100지급");
		se.incentive(100);
		sa.incentive(100);
		System.out.println("name \t department \t salary \t tax");
		System.out.println("-----------------------------------------------------");
		for(int i = 0;i<em.length;i++) {
			System.out.printf("%s \t %s \t %d \t %.1f\n",em[i].getName(),em[i].getDepartment(),em[i].getSalary(),em[i].tax());
		}
		
	}

}
