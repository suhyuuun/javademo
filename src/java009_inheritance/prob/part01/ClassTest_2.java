package java009_inheritance.prob.part01;

public class ClassTest_2 extends ClassTest_1{
	String department = "교육부";
	
	public ClassTest_2() {
		super();
	}

	public String getDepartment(){
		return department;
	}
	
	public ClassTest_2(String name, int salary, String department) {
		super();
		this.department = department;
	}
	
	public void callSuperThis() {
		
	}
	
	public void prn() {
		System.out.println("서브클래스");
	}

	
}//end ClassTest_2
