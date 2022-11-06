package jdbc_project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ConcertDAO {
	private Connection conn;
	private Statement stmt;
	private PreparedStatement pstmt;
	private ResultSet rs;

	private static ConcertDAO dao = new ConcertDAO();

	public ConcertDAO() {
		// TODO Auto-generated constructor stub
	}

	public static ConcertDAO getInstance() {
		return dao;
	}

	private Connection init() throws ClassNotFoundException, SQLException {
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
	}// end exit()

	public List<ConcertDTO> listMethod() {
		List<ConcertDTO> aList = new ArrayList<ConcertDTO>();

		try {
			conn = init();
			conn.setAutoCommit(false);
			stmt = conn.createStatement();

			String sql = "SELECT * FROM players ORDER BY num";
			rs = stmt.executeQuery(sql);

			while (rs.next()) {
				ConcertDTO dto = new ConcertDTO();
				dto.setNum(rs.getInt("num"));
				dto.setName(rs.getString("name"));
				dto.setInstrument(rs.getString("Instrument"));
				dto.setDay(rs.getInt("day"));
				dto.setPrice(rs.getInt("price"));
				dto.setProgramComposer(rs.getString("programComposer"));
				aList.add(dto);
			}

			conn.commit();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			try {
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		} finally {
			try {
				conn.setAutoCommit(true);
				exit();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
		return aList;
	}// end listMethod()

	public int insertMethod(ConcertDTO dto) {
		int chk = -1;

		try {
			conn = init();
			conn.setAutoCommit(false);

			String sql = "INSERT INTO players(num, name, instrument, day ,price, programComposer)";
			sql += "VALUES(players_num_seq.nextval,?,?,?,?,?)";

			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getInstrument());
			pstmt.setInt(3, dto.getDay());
			pstmt.setInt(4, dto.getPrice());
			pstmt.setString(5, dto.getProgramComposer());
			
			chk = pstmt.executeUpdate();

			conn.commit();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			try {
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		} finally {
			try {
				conn.setAutoCommit(true);
				exit();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
		return chk;
	}//end insertMethod()
	
	public int updateMethod(HashMap<String, Object> hmap) {
		int chk = -1;
		
		try {
			conn = init();
			conn.setAutoCommit(false);
			
			String sql = "UPDATE players SET day=? WHERE num=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, Integer.parseInt(hmap.get("day").toString())); 
			pstmt.setInt(2, Integer.parseInt(hmap.get("num").toString()));
			chk = pstmt.executeUpdate();
			
			conn.commit();
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			try {
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}finally {
			try {
				conn.setAutoCommit(true);
				exit();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return chk;
	}//end updateMethod()
	
	public int deleteMethod(int price) {
		int chk = -1;
		
		try {
			conn = init();
			conn.setAutoCommit(false);
			
			String sql = "DELETE FROM players WHERE price<=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, price);
			
			chk = pstmt.executeUpdate();
			
			conn.commit();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			try {
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}finally {
			try {
				conn.setAutoCommit(true);
				exit();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		
		return chk;
	}//end deleteMethod

}// end class