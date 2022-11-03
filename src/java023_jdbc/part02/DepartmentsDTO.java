package java023_jdbc.part02;

/*DTO : Data Transfer Object (데이터 전달 객체, 데이터 관리 객체)
		계층 간 데이터 교환을 하기 위해 사용하는 객체, DTO는 로직을 가지지 않는 순수한 데이터 객체(getter & setter)*/
//VO : Variable Object
//Entity : 데이터베이스와 연결하기 위함
public class DepartmentsDTO {	
	private int department_id;
	private String department_name;
	private int manager_id;
	private int location_id;
	
	public DepartmentsDTO() {
	
	}
	

	public int getDepartment_id() {
		return department_id;
	}

	public void setDepartment_id(int department_id) {
		this.department_id = department_id;
	}

	public String getDepartment_name() {
		return department_name;
	}

	public void setDepartment_name(String department_name) {
		this.department_name = department_name;
	}

	public int getManager_id() {
		return manager_id;
	}

	public void setManager_id(int manger_id) {
		this.manager_id = manger_id;
	}

	public int getLocation_id() {
		return location_id;
	}

	public void setLocation_id(int location_id) {
		this.location_id = location_id;
	}
	
	
}
