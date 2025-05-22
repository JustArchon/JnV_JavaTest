package JavaTest7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Num1 {
	public static void main(String[] args) {
		Connection conn = DriverManager.getConnection(dbURL, username, password);
		Statement st = conn.createStatement();
		String query = "DELETE FROM Student WHERE id = 103";
		System.out.println("Status: " + st.execute(query));
	}
}

/*
102 Edwin
103 Edward
103 Edwin


선택한 오답: A) 프로그램에 프린트된다. true, 두개의레코드가 학생 테이블에서 제거됬다.
정답: B) 프로그램에 프린트된다. false, 두개의레코드가 학생 테이블에서 제거됬다.

이유: st.execute의 true, false의 기준은 Select후 ResultSet의 결과값이 나올경우 true, resultset없이 update, delete만 진행 시, false가 뜬다고합니다.
*/