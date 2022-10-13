package java007_class.part09;

public class Employees {
	String name;
	int salary;
	
	public Employees() {
		
	}

	public Employees(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}
	
	public void display() {
		System.out.printf("%s %d\n", name, salary);
	}
}
