package ncs.answ.test10;

class Secretary extends Employee implements Bonus{
	public Secretary() {}
	
	public Secretary(String name, int number, String department, int salary) {
		super(name,number,department,salary);
	}
	
	@Override
	public double tax() {
		// TODO Auto-generated method stub
		return getSalary() * 0.1;
	}
	@Override
	public void incentive(int pay) {
		// TODO Auto-generated method stub
		int sum = (int) (getSalary() + pay * 0.8);
		setSalary(sum);
	}
}
