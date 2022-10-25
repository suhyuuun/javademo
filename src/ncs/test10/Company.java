package ncs.test10;

public class Company {

	public static void main(String[] args) {
		// 1번의 사용 데이터를 기반으로 객체를 생성하여 배열에 넣는다.
		Employee em[] = new Employee[2];
		
		Secretary se = new Secretary();
		se.setName("Hilery");
		se.setNumber(1);
		se.setDepartment("secretary");
		se.setSalary(800);
		em[0] = se;
		
		Sales sa = new Sales();
		sa.setName("Clinten");
		sa.setNumber(2);
		sa.setDepartment("sales");
		sa.setSalary(1200);
		em[1] = sa;

		// 모든 객체의 기본 정보를 출력 한다(for)
		System.out.println("name    department    salary");
		System.out.println("-----------------------------");
		for(int i = 0; i<2; i++) {
			System.out.printf("%s  %s    %d\n",em[i].getName(), em[i].getDepartment(), em[i].getSalary());
		}

		// 모든 객체에 인센티브 100씩 지급한 급여를 계산하고 다시 객체의 salary에 넣는다.
		
		
		
		// 모든 객체의 정보와 세금을 출력한다(for)
		System.out.println("인센티브 100지급");
		System.out.println("name    department    salary   tax");
		System.out.println("-----------------------------------");
		se.incentive(100);
		sa.incentive(100);
	}

}
