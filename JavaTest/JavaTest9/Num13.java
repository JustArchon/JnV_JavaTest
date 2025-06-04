package JavaTest9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Num13 {
	Connection conn = DriverManager.getConnection(dbURL, username, password);
	public static Connection getConnection() throws SQLException {
		try(Connection conn = DriverManager.getConnection(url, username, password)){
			newConnection = conn;
		}
	}
	public static void main(String[] args) {
		getConnection();
		Statement stmt = newConnection.createStatement();
		stmt.executeUpdate("INSERT INTO sutdent VALUES (102, 'Kelvin')");
	}
}

/*

선택한 오답: A) 프로그램에서 쿼리 실행이 성공되며 student에 대해서 첫번째 레코드가 업데이트된다.
정답: C) SQL 예외오류가난다.

이유: try with resource에 의한 에러이며, try with resource의 영역인 ()를 나갈경우 자동으로 close된다고합니다.
그래서 이미 작동된 후에는 이미 conn은 닫힌 객체이며, 이때문에 결국 sql예외 에러가발생합니다.
*/