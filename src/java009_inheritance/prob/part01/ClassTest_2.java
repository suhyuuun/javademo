package java009_inheritance.prob.part01;

public class ClassTest_2 extends ClassTest_1{
	String department;
	
	public ClassTest_2(String name, int salary, String department) {
		super(name, salary);
		this.department = department;
	}
	
	public void prn() {
		System.out.println("서브클래스");
	}
	
	public void callSuperThis() {
		super.prn();
		this.prn();		
	}
	
}//end ClassTest_2
