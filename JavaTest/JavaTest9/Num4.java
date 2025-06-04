package JavaTest9;

import java.sql.PreparedStatement;

public class Num4 {
	public static void main(String[] args) {
		PreparedStatement stmt = conn.prepareStatement("INSERT INTO CUSTOMER VALUES (?,?)");
		stmt.setInt(1, 42);
		/* Insert code here */
		int n = stmt.executeUpdate();
	}
}

/*
  ID Number Primary Key
  NAME Text Nullable
  라인 14줄에 어떤걸넣어야 NAME컬럼에 null값을 넣을수있나요


선택한 오답: C) stmt.setNull(2, null);
정답: A) stmt.setNull(2, java.sql.Types.VARCHAR);

이유: setNull()은 null을 설정한다는 점에서 해당 SQL타입을 반드시 지정해야한다는 특징이 있다고합니다. 그래서 C의 null을 넣는게아닌
해당 열의 타입을 넣은 A가 정답이라고 합니다.
*/