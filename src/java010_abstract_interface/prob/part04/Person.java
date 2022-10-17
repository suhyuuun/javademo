package java010_abstract_interface.prob.part04;

abstract public class Person {
	String name; //이름
	String jumin; //주민번호	
	

	public Person(String name, String jumin) {
		this.name = name;
		this.jumin = jumin;
	}	
	
	
	//주민번호 크기 반환
	public int genCount(){
		return jumin.length();
	}

	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJumin() {
		return jumin;
	}

	public void setJumin(String jumin) {
		this.jumin = jumin;
	}
	
	// 주민번호를 이용해서 성별을 구한후 반환
	abstract public char gender();
	
	// 주민번호를 이용한 년도4자리를 구한후 반환
	abstract public int getYear() ;
	
	
	// 주민번호를 이용한 월을 구한후 반환
	abstract public int getMonth();
	
	// 주민번호를 이용한 일을 구한후 반환
	abstract public int getDATE();

}//end class
