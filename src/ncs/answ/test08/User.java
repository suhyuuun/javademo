package ncs.answ.test08;


/*
 * 1. Cloneable 인터페이스 implements
 * 2. clone()메소드 오버라이딩하고 protected 접근제어자를 public으로 변경(상속관계가 아닌 다른 패키지에서 호출할 수있도록)
 * 3. clone()메소드에서 super.clone()메소드 리턴
 */

public class User implements Cloneable{ 
	private String id;
	private String password;
	private String name;
	private int age;
	private char gender;
	private String phone;

	public User() {
		super();
	}

	public User(String id, String password, String name, int age, char gender, String phone) {
		super();
		this.id = id;
		this.password = password;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.phone = phone;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return id + "\t" + password + "\t" + name + "\t" + age + "\t" + gender + "\t" + phone;
	}

	@Override
	public boolean equals(Object obj) {
		return this.toString().equals(obj.toString());
	}

	
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}	

}
