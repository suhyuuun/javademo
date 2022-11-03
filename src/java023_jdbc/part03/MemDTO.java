package java023_jdbc.part03;


public class MemDTO {
//변수명과 컬럼명 같게 해주어야 함 -> auto mapping을 위함 / java에서는 변수명 모두 소문자 사용
	private int num; 
	private String name;
	private int age;
	private String loc;
	
	public MemDTO() {
	
	}

	public MemDTO(String name, int age, String loc) {
		super();
		this.name = name;
		this.age = age;
		this.loc = loc;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}
	
}
