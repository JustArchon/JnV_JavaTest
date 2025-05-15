package JavaTest6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Num12 {
	public static void main(String[] args) {
		try {
			Connection conn  = DriverManager.getConnection(dbURL, username, password);
			String query = "SELECT * FROM ITEM WHERE ID = 110";
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while(rs.next()) {
				System.out.println("ID: " + rs.getString(1));
				System.out.println("Description: " + rs.getString(2));
				System.out.println("Price: " + rs.getString(3));
				System.out.println("Quantity: " + rs.getString(4));
			}
		} catch (SQLException e) {
			System.out.println("Error");
		}
	}
}

/*
데이터베이스 드라이버가 클래스패치에 선언되어있다.
데이터베이스에 엑세스하는 db주소, 유저네임, 비밀번호가 전부다있다.
쿼리는 유효하다.

Item table
ID INTEGER: PK
DESCRIP, VARCHAR
PRICE REAL
QUANTITY INTEGER

선택한 오답: C) 에러가 프린트된다.
정답: D) item 110에대한 정보를 표시해준다.

이유: getString은 BLOB을 제외한 타입을 전부 형변환을 통해서 표현해줍니다. 그러므로 따로 오류가발생하지않으며
단, 변수에 다시담을때 형을맞추지않으면 오류가발생합니다.
*/