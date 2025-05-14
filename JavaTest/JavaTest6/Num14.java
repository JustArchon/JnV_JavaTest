package JavaTest6;

public class Num14 {}

/*
문제: Which code fragment is required to load a JDBC 3.0 driver?

선택한 오답: D) DriverManager.loadDriver("org.xyzdata.jdbc.NetworkDriver");
정답: B) Class.forName("org.xyzdata.jdbc.NetworkDriver");

이유: JDBC 3.0은 자동로드가 되지않은 버전이며, Class ForName 로드를 통해 드라이버를 로드하는게 맞습니다.
DriverManager의 loadDriver는 이미 로드된 드라이버에 대해서 로드하는 것이며, forName을 통한 로드가 우선되어야합니다.

*/
