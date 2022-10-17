package java011_casting.part02;

public class Employee /*extends Object*/{
	String name;
	String code;
	
	public Employee() {
		
	}

	public Employee(String name, String code) {
		super();
		this.name = name;
		this.code = code;
	}
	
	@Override
	public String toString() {
		return String.format("name:%s code:%s", name, code);
	}
	
	public String pay() {
		return String.format("%s님의 급여는 %d입니다.\n", name, 5000);
	}
}
