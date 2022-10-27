package ncs.answ.test10;

abstract class Employee{
	private String name;
	private int number;
	private String depatment; //부서
	private int salary; // 월급
	
	public Employee() {}

	public Employee(String name, int number, String depatment, int salary) {
		this.name = name;
		this.number = number;
		this.depatment = depatment;
		this.salary = salary;
	}
	
	// 세금 
	public double tax() {
		return number;
		
	}

	public String getName() {
		return name;
	}

	public int getNumber() {
		return number;
	}

	public String getDepatment() {
		return depatment;
	}

	public int getSalary() {
		return salary;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public void setDepatment(String depatment) {
		this.depatment = depatment;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}	
}
