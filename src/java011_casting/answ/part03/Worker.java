package java011_casting.answ.part03;

//계약직 급여
class Worker extends Employment {
	int numDays;
	int numPay;

	public Worker() {

	}

	public Worker(String name, String dept, String section, int numDays, int numPay) {
		super(name, dept, section);
		this.numDays = numDays;
		this.numPay = numPay;
	}

	@Override
	public String toString() {
		return getName() + " " + getDept() + " " + getSection() + " " + numDays + " " + numPay;
	}

	@Override
	public long count() {
		return numDays * numPay;
	}
}// end Worker