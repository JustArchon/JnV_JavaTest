package JavaTest7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Num48 {
	public static void main(String[] args) {
		//code to load and register valid jdbc driver go here
		Connection conn = DriverManager.getConnection(dbURL, username, password);
		Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
				ResultSet.CONCUR_UPDATABLE);
		stmt.execute("SELECT * fROM student");
		ResultSet rs = st.getResultSet();
		rs.absolute(3);
		rs.moveToInsertRow();
		rs.updateInt(1, 113);
		rs.updateString(2, "Jannet");
		rs.updateString(3, "Jannet@uni.com");
		rs.updateRow();
		rs.refreshRow();
		System.out.println(rs.getInt(1) + " : " + rs.getString(2) + " : " + rs.getString(3));
	}
}

/*
문졔: Assume that the url, username, and password are valid. What is the result?

선택한 오답: C) The STUDENT table is updated with record 113 : Jannet : jannet@uni.com and program prints: 114 : John : john@uni.com
정답: D) 런타임과정에서 SQLException 에러가난다.

이유: rs.moveToInsertRow();를 호출했으므로, rs에 대해서 insertRow()를 호출했어야했으나, rs.updateRow();를 호출했습니다.
이에따라서 예외가발생하게되며 D 예외오류가 정답입니다.

*/
