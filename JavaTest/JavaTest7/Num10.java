package JavaTest7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Num10 {
	public static void main(String[] args) {
		Connection conn = DriverManager.getConnection(dbURL, username, password);
		String query = "SELECT id FROM Employee";
		try (Statement stmt = conn.createStatement()){
			ResultSet rs = stmt.executeQuery(query);
			stmt.executeQuery("SELECT id FROM Customer");
			while(rs.next()) {
				//process the results
				System.out.println("Employee ID: " + rs.getInt("id"));
			} 
		} catch (Exception e) {
			System.out.println("Error");
		}
	}
}

/*

The employee and customer tables are avaliable and each table has id column with a few records and the SQL queries are valid
다음 코드는 Employee 테이블의 id 값을 먼저 조회한 뒤, 같은 Statement 객체 stmt를 이용해 Customer 테이블의 id를 조회합니다

선택한 오답: A) The program prints employee IDs.
정답: C) The program prints Error

이유: ResutSet rs 를 통해서 executeQuery(query)를 이미 실행했고,
stmt.executeQuery("SELECT id FROM Customer");를 다시한번 실행했기 때문에 여기서 resultSet rs가 닫히면서 rs.next()에서 오류가 발생하며,
예외처리가 된다고합니다.
*/