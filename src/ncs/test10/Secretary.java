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
		int sum = (int) (getSalary() + pay *0.8);
		setSalary(sum);
	}
}
