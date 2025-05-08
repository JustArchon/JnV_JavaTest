package JavaTest5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Num24 {
	public static void main(String[] args) {
		try {
			Connection conn = DriverManager.getConnection(dbURL, username, password);
			String query = "SELECT * FROM Employee WHERE ID = 110";
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			System.out.println("Employee ID: " + rs.getInt("ID"));
		} catch (Exception e) {
			System.out.println("Error");
		}
	}
}

/*
The required database driver is configured in the classpath.
The appropriate database is accessible with the dbURL, username, and password exists.
The Employee table has a column ID of type integer and the SQL query matches one record.

선택한 오답: C) employeeID가 표시된다.
정답: D) 에러가뜬다.

이유: resultSet을 받고나서는 rs.next()를 통해 받아온 데이터를 가리켜야한다고 합니다.\
if(rs.next())
그렇지 않으면 표시되지 않으며 에러가뜬다고합니다.
*/