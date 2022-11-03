package java023_jdbc.part02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
/*
 *  1. ClassNotFoundException 
 *  해결) JRE System Library에서 ojdbc6.jar파일 확인
 *      Class.forName(): 경로확인
 *      
 * 2. java.sql.SQLException: 
 *     IO예외 상황:  The Network Adapter...
 *                 Listener refused.....  
 *                 
 *     해결) 제어판->관리도구->서비스->OracleServiceXE,
 *            OracleXETNSListener을 다시 시작한다.
 * 
 * java.sql.PreparedStatement
 * 1 반복되는 쿼리문의 수행에 사용한다.
 * 2 미리 정의된 SQL문을 수행하기 때문에 Statement에 비해 속도가 빠르다.
 * 3 위치표시자(placeholder)(?)를 사용하여 쿼리문을 간략하게 작성한다.
 * 
 * 싱글톤 패턴
 *  : 하나의 객체만을 생성해서 사용할 수 있도록 설계한 구조이다.
 *  1 생성자의 접근제어자는 private
 *  2 객체자신을 생성을 한다.
 *  3 생성된 객체를 넘겨줄 수 있는 메소드를 정의한다.
 */

//DAO : Data Access Object (데이터 접근 객체)
//DataBase에 접근하기 위한 로직 & 비지니스 로직을 분리하기 위해서 사용
public class DepartmentsDAO { // spring에서는 Repository
	private Connection conn;
	private Statement stmt;
	private PreparedStatement pstmt;
	private ResultSet rs;

	private static DepartmentsDAO dao = new DepartmentsDAO();

	private DepartmentsDAO() {
		
	}

	public static DepartmentsDAO getInstance() {
		return dao;
	} // singleton pattern

	// insert, select 할때마다 무조건 connection되어있는 것 받아와야함..?!
	private Connection init() throws ClassNotFoundException, SQLException { // init하는 곳에서 예외처리할 예정이기 때문에 throws
		Class.forName("oracle.jdbc.OracleDriver");
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String username = "hr";
		String password = "a1234";
		return DriverManager.getConnection(url, username, password);
	}// end init()

	private void exit() throws SQLException {
		if (rs != null)
			rs.close();

		if (stmt != null)
			stmt.close();

		if (pstmt != null)
			pstmt.close();

		if (conn != null)
			conn.close();

	}//end exit()
	
	public List<DepartmentsDTO> listDepartments(){
		List<DepartmentsDTO> aList = new ArrayList<DepartmentsDTO>();
		
		try {
			conn = init();
			conn.setAutoCommit(false);
			stmt = conn.createStatement();
			String sql = "SELECT * FROM departments ORDER BY department_id";
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				DepartmentsDTO dto = new DepartmentsDTO();
				dto.setDepartment_id(rs.getInt("department_id"));
				dto.setDepartment_name(rs.getString("department_name"));
				dto.setManager_id(rs.getInt("manager_id"));
				dto.setLocation_id(rs.getInt("location_id"));
				aList.add(dto); //따로따로 넣어주면 DB에서 넘어온 데이터간의 관련성이 사라짐
			}
			conn.commit();
		} catch (ClassNotFoundException | SQLException e) {
			try {
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		}finally {
			
			try {
				conn.setAutoCommit(true);
				exit();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return aList; //rs로 리턴하면 null값이 넘어감 -> 최종적으로 연결종료를 하기 때문 (resultset에서 null값을 줌)
	}//end listDepartments()
	
	
	public List<DepartmentsDTO> searchDepartments(String data){
		 List<DepartmentsDTO> aList = new ArrayList<DepartmentsDTO>();
		 
		 try {
			conn = init();
			conn.setAutoCommit(false);
			
//			stmt = conn.createStatement();
//			String sql = "SELECT * FROM departments WHERE department_name LIKE '%" + data + "%' ORDER BY department_id"; //변수는 쌍따옴표에서 빼줌
//			rs = stmt.executeQuery(sql);
			
			//위치표시자(placeholder) : ?를 사용하여 미리 자리를 확보해주는 것, query문 간결하게 구현가능
			//물음표가 지정된 순으로 인덱스 1,2,3 부여됨
			String sql = "SELECT * FROM departments WHERE department_name LIKE ? ORDER BY department_id"; 
			pstmt = conn.prepareStatement(sql); //query문에서 직접 가지고 오는 statement에 비해 대체적으로 속도가 빠르다.
			pstmt.setString(1, "%" + data + "%"); //setInt, setDate ...
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				DepartmentsDTO dto = new DepartmentsDTO();
				dto.setDepartment_id(rs.getInt("department_id"));
				dto.setDepartment_name(rs.getString("department_name"));
				dto.setManager_id(rs.getInt("manager_id"));
				dto.setLocation_id(rs.getInt("location_id"));
				aList.add(dto);
			}
			
			conn.commit();
			
		} catch (ClassNotFoundException | SQLException e) {
			try {
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		} finally {
			try {
				conn.setAutoCommit(true);
				exit();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		 
		 return aList;
	}//end searchDepartments();
}// end class
