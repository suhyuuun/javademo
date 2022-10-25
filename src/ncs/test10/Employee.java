package ncs.test10;

abstract public class Employee {
	private String name;
	private int number;
	String department; // 부서
	int salary; // 월급

	public Employee() {
		
	}

	public Employee(String name, int number, String department, int salary) {
		this.name = name;
		this.number = number;
		this.department = department;
		this.salary = salary;
	}

	public double tax() { // 세금
		return 0.0;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String departmnet) {
		this.department = departmnet;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

}
