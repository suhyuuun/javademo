package jdbc_project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ConcertDAO {

		private Connection conn;
		private Statement stmt;
		private PreparedStatement pstmt;
		private ResultSet rs;
		
		private static ConcertDAO dao = new ConcertDAO();
		
		private ConcertDAO() {
			
		}
		
		public static ConcertDAO getInstance() {
			return dao;
		}
		
		private Connection init() throws ClassNotFoundException, SQLException {
			Class.forName("oracle.jdbc.OracleDriver");
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String username = "hr";
			String password = "a1234";
			return DriverManager.getConnection(url,username, password);
		}//end init()
	
		private void exit() throws SQLException {
			if(rs != null)
				rs.close();
			if(stmt != null)
				stmt.close();
			if(pstmt != null)
				pstmt.close();
			if(conn != null)
				conn.close();
		}//end exit()
		
		public List<ConcertDTO> listMethod(){
			List<ConcertDTO> aList = new ArrayList<ConcertDTO>();
			
			try {
				conn = init();
				conn.setAutoCommit(false);
				stmt = conn.createStatement();
				
				String sql = "SELECT * FROM player ORDER BY num";
				rs = stmt.executeQuery(sql);
				
				while(rs.next()) {
					ConcertDTO dto = new ConcertDTO();
					dto.setNum(rs.getInt("num"));
					dto.setName(rs.getString("name"));
					dto.setInstrument(rs.getString("instrument"));
					dto.setDay(rs.getInt("day"));
					dto.setProgramComposer(rs.getString("programComposer"));
					dto.setPrice(rs.getInt("price"));
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
			}finally {
				try {
					conn.setAutoCommit(true);
					exit();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			return aList;
		}//end listMethod()
		
		
		
}//end class
