package JavaTest9;

import java.sql.JDBCType;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class Num28 {
	String ename = "SMITH";
	String empId = "42";
	
	public static void main(String[] args) {
		// Fragment 1:
		Statement stmt = conn.createStatement();
		String sql = "INSERT INTO EMP VALUES ('" + eName + "', '" + empId + "')";
		stmt.executeUpdate();
		
		// Fragment 2:
		String sql = "INSERT INTO EMP VALUES ('" + eName + "', '" + empId + "')";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setObject(1,  eName, JDBCType.VARCHAR);
		pstmt.setObject(2, empId, JDBCType.VARCHAR);
		pstmt.executeUpdate();
	}
}

/*
Which code fragment is preferred and why?
다음 두 코드 조각 중 어느 것이 더 바람직하며, 그 이유는 무엇인가?

선택한 오답: D) Fragment 1 because it is more performant.
정답: B) Fragment 2 because it prevents SQL injection.

preferred : 바람직

이유: preparedStatement하고 일반 Statement의 차이점을 물어보는 문제였으며, 문제또한 뭐가 더 바람직한가를 물어보는 문제였습니다.
여기서 D가 틀린이유는 sql자체를 String에서 그대로넣기때문에 SQL injection문제가 있으며, PreparedStatement의 경우는 입력값을 직접 ? 에 매칭시켜
넣기때문에 B대로 SQL injection등의 보안 취약점을 방어하기 더 좋다고합니다.
*/