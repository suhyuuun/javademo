package jdbc_project;

import java.util.HashMap;
import java.util.List;


public class ConcertController {
	private ConcertDAO dao;
	public ConcertController() {
		dao = ConcertDAO.getInstance();
	}
	
	public List<ConcertDTO> listProcess(){
		return dao.listMethod();
	}//end listProcess()
	
	public int insertProcess(ConcertDTO dto) {
		return dao.insertMethod(dto);
	}//end insertProcess()
	
	public int updateProcess(HashMap<String, Object> hmap) {
		return dao.updateMethod(hmap);
	}//end updateProcess()
	
	public int deleteProcess(int price) {
		return dao.deleteMethod(price);
	}//end deleteProcess()
	
}//end class
