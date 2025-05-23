package JavaTest7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Num15 {
	public static void main(String[] args) {
		try {
		Connection conn = DriverManager.getConnection(dbURL, username, password);
		Statement st = conn.createStatement(
				ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
		st.execute("SELECT * FROM Player");
		st.setMaxRows(2);
		ResultSet rs = st.getResultSet();
		rs.absolute(3);
		String query = "SELECT id FROM Employee";
		while(rs.next()) {
			System.out.println(rs.getInt(1) + " " + rs.getString(2));
		}
		} catch (SQLException ex) {
			System.out.println("SQLException is thrown");
		}
	}
}

/*

선택한 오답: C) 3 Sam
정답: B) 프린트가되지않는다.

이유: st.setMaxRows는 최대 가져오는 열을 지정하는 것이라고 합니다. 근데 거기에서 rs.absolute는 resultSet에서 3번째 행으로 이동을 시도하는 코드라고하며
이전에 2번째열까지 가져오라고 했기때문에 3번쨰열은 아무것도없습니다. 그에따라서 아무것도 프린트되지 않습니다.
*/