package java023_jdbc.part02;

import java.util.List;

public class DepartmentsController {
	public DepartmentsController() {

	}
	
	public void departmentsAllProcess() {
		DepartmentsDAO dao = DepartmentsDAO.getInstance();
		List<DepartmentsDTO> aList = dao.listDepartments();
		
		for(DepartmentsDTO dto : aList) {
			System.out.printf("%d %s %d %d\n",
					dto.getDepartment_id(),
					dto.getDepartment_name(),
					dto.getManager_id(),
					dto.getLocation_id());
		}
	}//end departmentsAllProcess()
	
}//end class