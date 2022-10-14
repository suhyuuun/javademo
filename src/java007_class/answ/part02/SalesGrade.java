package java007_class.answ.part02;

public class SalesGrade {
	int hisal;
	int losal;
	char grade;

	SalesGrade(int losal, int hisal, char grade) {
		this.losal = losal;
		this.hisal = hisal;
		this.grade = grade;
	}

	public String toString() {
		return losal + " " + hisal + " " + grade;
	}
}// end class
