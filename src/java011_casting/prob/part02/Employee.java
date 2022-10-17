package java011_casting.prob.part02;

//직군별 보너스를 다르게 지급
public class Employee {
	String name;
	int salary;

	public Employee() {
		super();
	}

	public Employee(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	// 정규보너스
	public int getBonus() {
		return 0;
	}

	@Override
	public String toString() {
		return name + "\t\t" + salary;
	}
}
