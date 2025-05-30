package JavaTest8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Num19 {
	public static void main(String[] args) {
		try {
		Connection conn = DriverManager.getConnection(dbURL, username, password);
		Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
		stmt.execute("SELECT * FROM EMPLOYEE");
		ResultSet rs = stmt.getResultSet();
		while(rs.next()) {
			if (rs.getInt(1) == 112) {
				rs.updateString(2,  "Jack");
				}
			}
		rs.absolute(2);
		System.out.println(rs.getInt(1) + " " + rs.getString(2));
		} catch (SQLException e) {
			System.out.println("Exception is rasied");
		}
	}
}

/*

선택한 오답: B) The Employee table is updated with the row : 112 Jack and the program prints: 112 Jack
정답: C) The Employee table is not updated and the program prints: 112 Jerry

이유: sql update이 실행되기 위해서는 updateString등을 통해서 값 변경을 한 후, uipdateRow()를 실행시켜서 열을 업데이트해야 적용된다고합니다.
*/