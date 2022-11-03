package java023_jdbc.part02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

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
				aList.add(dto); //따로따로 넣어주면 db에서 넘어온 데이터간의 관련성이 사라짐
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
