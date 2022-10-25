package ncs.test10;

public class Secretary extends Employee implements Bonus {

	public Secretary() {
		
	}

	public Secretary(String name, int number, String department, int salary) {
		super(name, number, department, salary);
		
	}
	
	public double tax(double d) {
		return d*0.1;
	}
	
	@Override
	public void incentive(int pay) {
		System.out.printf("%s  %s    %.0f    %.1f\n",getName(), getDepartment(), getSalary()+(pay*0.8), tax(getSalary()+(pay*0.8)));
	}
}
