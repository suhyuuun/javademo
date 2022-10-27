package ncs.answ.test10;

public class Company{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee[] employees = new Employee[2];
		
		Secretary sc = new Secretary("Hilery", 1, "secretary", 800);
		employees[0] = sc;
		Sales sa = new Sales("Clinten", 2, "sales", 1200);
		employees[1] = sa;
		
		System.out.println("name\t department\t salary");
		System.out.println("-------------------------------");
		for (int i = 0; i < employees.length; i++) {
			System.out.printf("%s\t%s\t%d\n", employees[i].getName(),employees[i].getDepatment(),
					employees[i].getSalary());
		}
		
		
		System.out.println("인센티브 100지급");
		sc.incentive(100);
		sa.incentive(100);
		
		System.out.println("name\t department\tsalary\ttax");
		System.out.println("-------------------------------");
		for (int i = 0; i < employees.length; i++) {
			System.out.printf("%s\t%s\t%d\t%.1f\n", employees[i].getName(),employees[i].getDepatment(),
					employees[i].getSalary(),employees[i].tax());
		}
	}
}
