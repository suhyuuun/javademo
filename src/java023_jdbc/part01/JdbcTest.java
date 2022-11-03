package java023_jdbc.part01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcTest {
	private Connection conn;
	private Statement stmt;
	private ResultSet rs;

	public JdbcTest() {
	}

	public void process() {
		try {
			// 1. 드라이버 로딩
			Class.forName("oracle.jdbc.OracleDriver");

			// 2. 서버연결
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String username = "hr";
			String password = "a1234";
			conn = DriverManager.getConnection(url, username, password);

			// System.out.println(conn);

			conn.setAutoCommit(false); // 자동 오토 커밋 -> 꺼져있는지(false) 확인

			// 3. 쿼리문을 실행하기 위한 Statement타입의 객체를 가져옴
			stmt = conn.createStatement();

			// 4. 쿼리문을 실행 : SELECT- executeQuery() / INSERT, UPDATE, DELETE -
			// executeUpdate()
			String sql = "SELECT * FROM departments ORDER BY department_id";
			rs = stmt.executeQuery(sql);
			// oracle.jdbc.driver.OracleResultSetImpl@71c3b41
			// System.out.println(rs);

			// 5. 쿼리문의 결과 출력 -> 커서를 이동해서(next) 출력해오기 / 컬럼명을 이용해서 가지고옴
			while (rs.next()) {
				int departmentId = rs.getInt("department_id");
				String departName = rs.getString("department_name");
				int managerId = rs.getInt("manager_id");
				int locationId = rs.getInt("location_id");
				System.out.printf("%d %s %d %d\n", departmentId, departName, managerId, locationId);
			}

			conn.commit();

		} catch (ClassNotFoundException e) {
			try {
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.setAutoCommit(true); // 굳이 안켜도 상관없음
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			//6. JDBC 연결 종료
			if (rs != null)
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}

			if (stmt != null)
				try {
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}

			if (conn != null)
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}
	}

}
