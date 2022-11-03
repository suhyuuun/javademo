package java023_jdbc.part02;

import java.util.List;

public class DepartmentsController {
	public DepartmentsController() {

	}
	
	public List<DepartmentsDTO> departmentsAllProcess() {
		DepartmentsDAO dao = DepartmentsDAO.getInstance();
		return dao.listDepartments();
		
	}//end departmentsAllProcess()
	
}//end class