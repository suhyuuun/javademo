package ncs.test10;

public class Sales extends Employee implements Bonus {
	public Sales() {
		
	}
	
	public Sales(String name, int number, String department, int salary) {
		super(name, number, department, salary);
		
	}
	
	public double tax(double d) {
		return d*0.13;
	}
	
	@Override
	public void incentive(int pay) {
		System.out.printf("%s  %s    %.0f    %.1f\n",getName(), getDepartment(), getSalary()+(pay*1.2), tax(getSalary()+(pay*1.2)));

	}
}
