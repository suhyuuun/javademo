package java011_casting.answ.part03;

//정직원 급여
class Regular extends Employment {
	private int salary;
	private int allowance;

	public Regular() {

	}

	public Regular(String name, String dept, String section, int salary, int allowance) {
		super(name, dept, section);
		this.salary = salary;
		this.allowance = allowance;
	}

	@Override
	public String toString() {
		return getName() + " " + getDept() + " " + getSection() + " " + salary + " " + allowance;
	}

	@Override
	public long count() {
		return salary + allowance;
	}

}// end Regular