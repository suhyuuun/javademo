package jdbc_project;

import java.util.List;

public class ConcertController {
	private ConcertDAO dao;
	public ConcertController() {
		dao = ConcertDAO.getInstance();
	}
	
	public List<ConcertDTO> listProcess(){
		return dao.listMethod();
	}//end listProcess()
	
	
	
	
	
	
	
	
	
	
}//end class
