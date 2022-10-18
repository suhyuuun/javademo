package java011_casting.answ.part03;

//사원클래스
abstract class Employment {
	private String name;
	private String dept;
	private String section;

	public Employment() {

	}

	public Employment(String name, String dept, String section) {
		this.name = name;
		this.dept = dept;
		this.section = section;
	}

	public String getName() {
		return name;
	}

	public String getDept() {
		return dept;
	}

	public String getSection() {
		return section;
	}

	@Override
	public String toString() {
		return name + " " + dept + " " + section;
	}

	abstract public long count();

}